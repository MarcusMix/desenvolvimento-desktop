package pacoteRevisao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField nomeInput;
	private JTextField emailInput;
	int quantidade = 0;
	int index;
	public ArrayList<String> nomes = new ArrayList<String>();
	public ArrayList<String> emails = new ArrayList<String>();
	private JTextField indexArray;
	private JTextField logInput;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		nomeLabel.setBounds(10, 24, 46, 14);
		contentPane.add(nomeLabel);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		emailLabel.setBounds(10, 102, 46, 14);
		contentPane.add(emailLabel);
		setLocationRelativeTo(null);
		setTitle("Programa do Marcus");
	
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		cadastrarButton.setBackground(new Color(50, 205, 50));
		cadastrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeInput.getText().isBlank()) {
					logInput.setForeground(Color.decode("#BD2A2E"));
					logInput.setText("Nome não pode ficar vazio!");
				} else if (emailInput.getText().isBlank()) {
					logInput.setForeground(Color.decode("#BD2A2E"));
					logInput.setText("E-mail não pode ficar vazio!");
				} else  {
					logInput.setText("");
					String nomeConvertido = String.valueOf(nomeInput.getText());
					nomes.add(nomeConvertido);
					logInput.setText("");
					String emailConvertido = String.valueOf(emailInput.getText());
					emails.add(emailConvertido);
					logInput.setForeground(Color.decode("#03A64A"));
					logInput.setText("Cadastrado com sucesso!");
					System.out.println("LOG: nome adicionado!" + nomes);
				}
				
				indexArray.setText(Integer.toString(quantidade));
				indexArray.setText(Integer.toString(quantidade));
			}
		});
		cadastrarButton.setBounds(40, 378, 118, 23);
		contentPane.add(cadastrarButton);
		
		JButton novoButton = new JButton("Novo");
		novoButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		novoButton.setBackground(new Color(30, 144, 255));
		novoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeInput.getText().isBlank()) {
					logInput.setText("Nome pode ficar vazio!");
				} else {
					logInput.setText("");
					nomeInput.setText("");
					emailInput.setText("");
					quantidade++;
					indexArray.setText(Integer.toString(quantidade));
					System.out.println("LOG: quantidade: " + quantidade);
					nomeInput.requestFocus();
				}
			}
		});
		novoButton.setBounds(172, 378, 89, 23);
		contentPane.add(novoButton);
		
		JButton voltarButton = new JButton("<");
		voltarButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomes.size() > quantidade && quantidade <= 0) {
					System.out.println("LOG: Impossível voltar");
					return;
				} else if(nomes.size() == 0) {
					System.out.println("LOG: Impossível voltar");
					return;
				} else if (nomes.size() < 0) {
					System.out.println("LOG: Impossível voltar");
					return;
				} else {
					quantidade--;
				}
				indexArray.setText(Integer.toString(quantidade));
				nomes.get(quantidade);
				nomeInput.setText(nomes.get(quantidade));
				emailInput.setText(nomes.get(quantidade));
				System.out.println("LOG: Voltar index: " + quantidade);
			}
		});
		voltarButton.setBounds(282, 378, 56, 23);
		contentPane.add(voltarButton);
		
		JButton avancarButton = new JButton(">");
		avancarButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		avancarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomes.size() > quantidade && quantidade < 0) {
					System.out.println("LOG: Impossível avançar");
					return;
				} else if (nomes.size() == 0) {
					System.out.println("LOG: Impossível avançar");
					return;
				} else if(nomes.get(index).equals(nomes.size())) {
					System.out.println("LOG: Impossível avançar");
					return;
				} else if (nomes.size() - quantidade == 0) {
					System.out.println("LOG: Impossível avançar");
					return;
				} else if (nomes.size() - quantidade == 1) {
					System.out.println("LOG: Impossível avançar");
					return;
				}
				else {
					quantidade++;
				}
				indexArray.setText(Integer.toString(quantidade));
				nomes.get(quantidade);
				nomeInput.setText(nomes.get(quantidade));
				emailInput.setText(nomes.get(quantidade));
				System.out.println("LOG: Avançar index: " + quantidade);
			}
		});
		avancarButton.setBounds(348, 378, 56, 23);
		contentPane.add(avancarButton);
		
		nomeInput = new JTextField();
		nomeInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		nomeInput.setBounds(100, 21, 185, 20);
		contentPane.add(nomeInput);
		nomeInput.setColumns(10);
		
		emailInput = new JTextField();
		emailInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		emailInput.setColumns(10);
		emailInput.setBounds(100, 99, 185, 20);
		contentPane.add(emailInput);
		
		indexArray = new JTextField();
		indexArray.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		indexArray.setColumns(10);
		indexArray.setBounds(397, 21, 95, 20);
		contentPane.add(indexArray);
		
		JButton cancelButton = new JButton("Cancelar");
		cancelButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		cancelButton.setBackground(new Color(189, 42, 46));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal.this.dispose();
			}
		});
		cancelButton.setBounds(423, 378, 89, 23);
		contentPane.add(cancelButton);
		
		JLabel indexLabel = new JLabel("index");
		indexLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		indexLabel.setBounds(341, 24, 46, 14);
		contentPane.add(indexLabel);
		
		JLabel logLabel = new JLabel("log");
		logLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		logLabel.setBounds(341, 76, 46, 14);
		contentPane.add(logLabel);
		
		logInput = new JTextField();
		logInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		logInput.setForeground(Color.RED);
		logInput.setColumns(10);
		logInput.setBounds(397, 73, 161, 20);
		contentPane.add(logInput);
		
		JButton feitoButton = new JButton("Feito");
		feitoButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		feitoButton.setBackground(new Color(152, 251, 152));
		feitoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alunos dialog = new Alunos(nomes, emails);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		feitoButton.setBounds(522, 378, 89, 23);
		contentPane.add(feitoButton);
	}
}
