package pacoteRevisao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Alunos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField alunosInput;
	private JTextField emailInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Alunos dialog = new Alunos(null, null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Alunos(ArrayList<String> nomes, ArrayList<String> emails) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			alunosInput = new JTextField();
			alunosInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
			alunosInput.setBounds(64, 41, 299, 55);
			contentPanel.add(alunosInput);
			alunosInput.setColumns(10);
			for(int i = 0; i < nomes.size(); i++) {
				alunosInput.setText(alunosInput.getText()+ (i+1) + "°- " + nomes.get(i) + " ");
			}
		}
		{
			JLabel alunosLabel = new JLabel("Alunos: ");
			alunosLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
			alunosLabel.setBounds(84, 16, 46, 14);
			contentPanel.add(alunosLabel);
		}
		{
			JLabel emailLabel = new JLabel("E-mail: ");
			emailLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
			emailLabel.setBounds(84, 107, 46, 14);
			contentPanel.add(emailLabel);
		}
		{
			emailInput = new JTextField();
			emailInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
			emailInput.setColumns(10);
			emailInput.setBounds(64, 130, 299, 55);
			contentPanel.add(emailInput);
			for(int i = 0; i < emails.size(); i++) {
				emailInput.setText(emailInput.getText()+ (i+1) + "°- " + emails.get(i) + " ");
			}
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Alunos.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
