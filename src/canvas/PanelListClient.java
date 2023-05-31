package canvas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelListClient extends JPanel {
	private JButton btnRegister;
	private JTextField inputNomes;


	public PanelListClient() {
		setBackground(new Color(255, 160, 122));
		setLayout(null);

		String[] nomes = {"João", "Maria", "Pedro", "Ana", "Carlos"};

		JLabel lblClient = new JLabel("Listar Cliente");
		lblClient.setBounds(155, 44, 133, 22);
		lblClient.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(lblClient);

		btnRegister = new JButton("Listar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preencherPessoas(nomes);
			}
		});
		btnRegister.setBounds(297, 149, 103, 23);
		add(btnRegister);
		
		inputNomes = new JTextField();
		inputNomes.setBounds(21, 119, 151, 145);
		add(inputNomes);
		inputNomes.setColumns(10);

	}

	public void preencherPessoas(String[] nomes) {
		for (int i = 0; i < nomes.length; i++) {
			String names = "";
			names = names += nomes[i] + " ,";
			inputNomes.setText(names);				
		}
	}


}

