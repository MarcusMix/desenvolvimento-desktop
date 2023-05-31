package canvas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class PanelRegisterClient extends JPanel {
	private JTextField inputName;
	private JTextField inputCPF;
	private JTextField inputEmail;
	private JLabel lblCpf;
	private JLabel lblEmail;
	private JButton btnRegister;

	
	public PanelRegisterClient() {
		setBackground(new Color(255, 160, 122));
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
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(29, 133, 46, 14);
		add(lblCpf);
		
		inputEmail = new JTextField();
		inputEmail.setColumns(10);
		inputEmail.setBounds(28, 193, 86, 20);
		add(inputEmail);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(29, 176, 46, 14);
		add(lblEmail);
		
		btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(178, 149, 103, 23);
		add(btnRegister);

	}
}
