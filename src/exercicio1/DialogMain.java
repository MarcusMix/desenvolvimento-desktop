package exercicio1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DialogMain extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoInput;
	public String textoDigitado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogMain dialog = new DialogMain();
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
	public DialogMain() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblQualquerCoisa = new JLabel("Digite qualquer coisa:");
		lblQualquerCoisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblQualquerCoisa.setFont(new Font("Ubuntu", Font.PLAIN, 32));
		lblQualquerCoisa.setBounds(10, 38, 414, 45);
		contentPanel.add(lblQualquerCoisa);
		
		textoInput = new JTextField();
		textoInput.setBackground(new Color(255, 255, 255));
		textoInput.setHorizontalAlignment(SwingConstants.CENTER);
		textoInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		textoInput.setToolTipText("");
		textoInput.setBounds(109, 94, 207, 78);
		contentPanel.add(textoInput);
		textoInput.setColumns(10);
		setResizable(false);
		setTitle("Formulário");
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textoDigitado = textoInput.getText();
						PopUp popup =  new PopUp(textoDigitado);
						popup.setVisible(true);
						setResizable(false);
						popup.setLocationRelativeTo(null);
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
						DialogMain.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
