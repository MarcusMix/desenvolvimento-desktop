package canvas;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class PanelRegisterClient extends JPanel {
	private JTextField inputName;
	private JTextField inputCPF;
	private JTextField inputEmail;

	/**
	 * Create the panel.
	 */
	public PanelRegisterClient() {
		setLayout(null);
		
		JLabel lblClient = new JLabel("Cadastrar Cliente");
		lblClient.setBounds(155, 44, 133, 22);
		lblClient.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblClient);
		
		inputName = new JTextField();
		inputName.setBounds(28, 109, 86, 20);
		add(inputName);
		inputName.setColumns(10);
		
		JLabel lblName = new JLabel("Nome:");
		lblName.setBounds(29, 92, 46, 14);
		add(lblName);
		
		inputCPF = new JTextField();
		inputCPF.setColumns(10);
		inputCPF.setBounds(28, 150, 86, 20);
		add(inputCPF);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(29, 133, 46, 14);
		add(lblCpf);
		
		inputEmail = new JTextField();
		inputEmail.setColumns(10);
		inputEmail.setBounds(28, 193, 86, 20);
		add(inputEmail);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(29, 176, 46, 14);
		add(lblEmail);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(199, 149, 89, 23);
		add(btnRegister);

	}
}
