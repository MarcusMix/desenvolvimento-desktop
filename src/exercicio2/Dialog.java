package exercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Dialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField numeroInput;
	public int numeroDigitado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dialog dialog = new Dialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dialog() {
		setBounds(100, 100, 250, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setTitle("Verificar se é Impar ou Par");
		setResizable(false);
		{
			JLabel lblNewLabel = new JLabel("Digite um número:");
			lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 18));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(10, 45, 214, 27);
			contentPanel.add(lblNewLabel);
		}
		{
			numeroInput = new JTextField();
			numeroInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
			numeroInput.setBounds(74, 83, 86, 37);
			contentPanel.add(numeroInput);
			numeroInput.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							numeroDigitado = Integer.parseInt(numeroInput.getText());	
						} catch (NumberFormatException error) {
							JanelaResposta janela = new JanelaResposta("Erro: campo só aceita números!");
							janela.setVisible(true);
							setResizable(false);
							janela.setLocationRelativeTo(null);
							System.out.print("Erro" + error);
							return;
						}
						
						if(numeroDigitado % 2 == 0) {
							//par
							JanelaResposta janela = new JanelaResposta("O número digitado é Par");
							janela.setVisible(true);
							setResizable(false);
							janela.setLocationRelativeTo(null);
						} else {
							//impar
							JanelaResposta janela = new JanelaResposta("O número digitado é Impar");
							janela.setVisible(true);
							setResizable(false);
							janela.setLocationRelativeTo(null);
						}
				
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Dialog.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
