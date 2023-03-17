package pacoteRevisao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField nomeInput;
	private JTextField emailInput;
	private JTextField idadeInput;
	private JTextField indexArray;
	private JTextField logInput;
	private JTextField telefoneInput;
	private int quantidade = 0;
	private int index;
	public ArrayList<String> nomes = new ArrayList<String>();
	public ArrayList<String> emails = new ArrayList<String>();
	public ArrayList<String> idades = new ArrayList<String>();
	public ArrayList<String> telefones = new ArrayList<String>();
	
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
	
	public static void invocarJanelas(String message) {
		Dialog dialogo = new Dialog(message);
		dialogo.setLocationRelativeTo(null);
		dialogo.setVisible(true);
	}
	
	public static void invocarJanelasOk(String message) {
		Dialog dialogo = new Dialog(message);
		dialogo.setLocationRelativeTo(null);
		dialogo.setVisible(true);
		dialogo.setTitle("Sucesso!");
	}

	
	//construtor
	public Principal()  {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(new Color(192, 192, 192), 0, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Programa do Marcus");
		
		
		JButton cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		cadastrarButton.setBackground(new Color(50, 205, 50));
		cadastrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeInput.getText().isBlank()) {
					invocarJanelas("Nome não pode ficar vazio!");
				} else if (emailInput.getText().isBlank()) {
					invocarJanelas("E-mail não pode ficar vazio!");
				} else if(idadeInput.getText().isBlank()) {
					invocarJanelas("Idade não pode ficar vazio!");
				} else if (telefoneInput.getText().isBlank()) {
					invocarJanelas("Telefone não pode ficar vazio!");
				} else  {
					//convertendo nome
					String nomeConvertido = String.valueOf(nomeInput.getText());
					nomes.add(nomeConvertido);
					
					//convertendo e-mail
					String emailConvertido = String.valueOf(emailInput.getText());
					emails.add(emailConvertido);
					
					//convertendo idade
					String idadeConvertida = String.valueOf(idadeInput.getText());
					idades.add(idadeConvertida);
					
					//convertendo telefone
					String telefoneConvertido = String.valueOf(telefoneInput.getText());
					telefones.add(telefoneConvertido);
					
					//confirmação
					System.out.println("LOG: nome adicionado!" + nomes);
					System.out.println("LOG: TELEFONE adicionado!" + telefones);
					invocarJanelasOk("Cadastrado com sucesso!");
				}
				indexArray.setText(Integer.toString(quantidade));
				
			}
		});
		cadastrarButton.setBounds(40, 378, 118, 23);
		contentPane.add(cadastrarButton);
		
		JButton novoButton = new JButton("Novo");
		novoButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		novoButton.setBackground(new Color(30, 144, 255));
		novoButton.setEnabled(true);
		novoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomeInput.getText().isBlank()) {
					invocarJanelas("Idade não pode ficar vazio!");
				} else if (emailInput.getText().isBlank()) {
					invocarJanelas("E-mail não pode ficar vazio!");
				} else if(idadeInput.getText().isBlank()) {
					invocarJanelas("Idade não pode ficar vazio!");
				} else if (telefoneInput.getText().isBlank()) {
					invocarJanelas("Telefone não pode ficar vazio!");
				} else {
					nomeInput.setText("");
					emailInput.setText("");
					idadeInput.setText("");
					telefoneInput.setText("");
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
				emailInput.setText(emails.get(quantidade));
				idadeInput.setText(idades.get(quantidade));
				telefoneInput.setText(telefones.get(quantidade));
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
				emailInput.setText(emails.get(quantidade));
				idadeInput.setText(idades.get(quantidade));
				telefoneInput.setText(telefones.get(quantidade));
				System.out.println("LOG: Avançar index: " + quantidade);
			}
		});
		avancarButton.setBounds(348, 378, 56, 23);
		contentPane.add(avancarButton);
		
		//input's
		nomeInput = new JTextField();
		nomeInput.setToolTipText("");
		nomeInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		nomeInput.setBounds(100, 21, 185, 20);
		contentPane.add(nomeInput);
		nomeInput.setColumns(10);
		nomeInput.requestFocus();
		
		emailInput = new JTextField();
		emailInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		emailInput.setColumns(10);
		emailInput.setBounds(100, 99, 185, 20);
		contentPane.add(emailInput);
		
		idadeInput = new JTextField();
		idadeInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		idadeInput.setColumns(10);
		idadeInput.setBounds(100, 179, 185, 20);
		contentPane.add(idadeInput);
		
		indexArray = new JTextField();
		indexArray.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		indexArray.setColumns(10);
		indexArray.setBounds(397, 21, 95, 20);
		contentPane.add(indexArray);
		
	
		telefoneInput = new JTextField();
		
		
		telefoneInput.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		telefoneInput.setColumns(10);
		telefoneInput.setBounds(91, 237, 188, 20);
		
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
		
		JButton feitoButton = new JButton("Feito");
		feitoButton.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		feitoButton.setBackground(new Color(152, 251, 152));
		feitoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Alunos dialog = new Alunos(nomes, emails, idades, telefones);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		feitoButton.setBounds(522, 378, 89, 23);
		contentPane.add(feitoButton);
		
		//label's
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(10, 11, 289, 283);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel idadeLabel = new JLabel("Idade:");
		idadeLabel.setBounds(10, 171, 46, 14);
		panel.add(idadeLabel);
		idadeLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(10, 92, 46, 14);
		panel.add(emailLabel);
		emailLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeLabel.setBounds(10, 11, 46, 14);
		panel.add(nomeLabel);
		nomeLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		
		
		
		
		JLabel telefoneLabel = new JLabel("Telefone:");
		telefoneLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		telefoneLabel.setBounds(10, 240, 46, 14);
		panel.add(telefoneLabel);
		panel.add(telefoneInput);
		
		JLabel indexLabel = new JLabel("index");
		indexLabel.setFont(new Font("Ubuntu", Font.PLAIN, 11));
		indexLabel.setBounds(341, 24, 46, 14);
		contentPane.add(indexLabel);
		
	}
}
