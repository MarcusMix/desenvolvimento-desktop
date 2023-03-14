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

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField nomeInput;
	private JTextField emailInput;
	int quantidade = 0;
	int index;
	public ArrayList<String> nomes = new ArrayList<String>();
	private JTextField indexArray;
	private JTextField logInput;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setBounds(10, 24, 46, 14);
		contentPane.add(nomeLabel);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(10, 102, 46, 14);
		contentPane.add(emailLabel);
		setLocationRelativeTo(null);
	
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeInput.getText().isBlank()) {
					logInput.setText("Não pode ficar vazio!");
				} else {
					logInput.setText("");
					String nomeConvertido = String.valueOf(nomeInput.getText());
					nomes.add(nomeConvertido);
				}
				
//				else if (emailInput.getText().isBlank()) {
//					emailInput.setText("Não pode ficar vazio!");
//				}
				
				
				String emailConvertido = String.valueOf(emailInput.getText());
				
				
				System.out.println("NOME!!!!" + nomes);
				System.out.println("INDEX!!!!" + index);
				indexArray.setText(Integer.toString(quantidade));
				indexArray.setText(Integer.toString(quantidade));
			}
		});
		cadastrarButton.setBounds(40, 378, 118, 23);
		contentPane.add(cadastrarButton);
		
		JButton novoButton = new JButton("Novo");
		novoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeInput.getText().isBlank()) {
					logInput.setText("Não pode ficar vazio!");
				} else {
					logInput.setText("");
					nomeInput.setText("");
					emailInput.setText("");
					quantidade++;
					indexArray.setText(Integer.toString(quantidade));
					System.out.println(quantidade);
					nomeInput.requestFocus();
				}
				
			}
		});
		novoButton.setBounds(172, 378, 89, 23);
		contentPane.add(novoButton);
		
		JButton voltarButton = new JButton("<");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomes.size() > quantidade) {
					System.out.print("DEU voltar merda!!!!");
					quantidade--;
				} else if(nomes.size() == 0) {
					System.out.print("tamanho menoor");
					return;
				} else {
					quantidade--;
				}
				indexArray.setText(Integer.toString(quantidade));
				nomes.get(quantidade);
				nomeInput.setText(nomes.get(quantidade));
				System.out.print("voltar" + quantidade);
			}
		});
		voltarButton.setBounds(282, 378, 56, 23);
		contentPane.add(voltarButton);
		
		JButton avancarButton = new JButton(">");
		avancarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomes.size() < quantidade) {
					System.out.print("DEU MERDA!!!!");
					return;
				} else if (nomes.size() == 0) {
					System.out.print("tamanho menoor");
					return;
				} else {
					quantidade++;
				}

				indexArray.setText(Integer.toString(quantidade));
				
				nomes.get(quantidade);
				nomeInput.setText(nomes.get(quantidade));
				System.out.print("avançar" + quantidade);
			}
		});
		avancarButton.setBounds(348, 378, 56, 23);
		contentPane.add(avancarButton);
		
		nomeInput = new JTextField();
		nomeInput.setBounds(100, 21, 185, 20);
		contentPane.add(nomeInput);
		nomeInput.setColumns(10);
		
		emailInput = new JTextField();
		emailInput.setColumns(10);
		emailInput.setBounds(100, 99, 185, 20);
		contentPane.add(emailInput);
		
		indexArray = new JTextField();
		indexArray.setColumns(10);
		indexArray.setBounds(397, 21, 95, 20);
		contentPane.add(indexArray);
		
		JButton cancelButton = new JButton("Cancelar");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Principal.this.dispose();
			}
		});
		cancelButton.setBounds(423, 378, 89, 23);
		contentPane.add(cancelButton);
		
		JLabel indexLabel = new JLabel("index");
		indexLabel.setBounds(341, 24, 46, 14);
		contentPane.add(indexLabel);
		
		JLabel logLabel = new JLabel("log");
		logLabel.setBounds(341, 76, 46, 14);
		contentPane.add(logLabel);
		
		logInput = new JTextField();
		logInput.setForeground(Color.RED);
		logInput.setColumns(10);
		logInput.setBounds(397, 73, 161, 20);
		contentPane.add(logInput);
		
		JButton feitoButton = new JButton("Feito");
		feitoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alunos dialog = new Alunos(nomes);
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
