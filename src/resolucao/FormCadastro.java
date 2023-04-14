package resolucao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class FormCadastro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField inputTitulo;
	private JTextField inputCategoria;
	private JTextField inputAutor;
	private JTextField inputAno;
	private JTextField inputPagina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FormCadastro dialog = new FormCadastro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormCadastro() {
		setModal(true);
		setBounds(0, -15, 567, 433);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(26, 33, 46, 14);
		contentPanel.add(lblTitulo);
		
		inputTitulo = new JTextField();
		inputTitulo.setBounds(92, 30, 320, 20);
		contentPanel.add(inputTitulo);
		inputTitulo.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(26, 61, 56, 14);
		contentPanel.add(lblCategoria);
		
		inputCategoria = new JTextField();
		inputCategoria.setColumns(10);
		inputCategoria.setBounds(92, 58, 320, 20);
		contentPanel.add(inputCategoria);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(26, 92, 56, 14);
		contentPanel.add(lblAutor);
		
		inputAutor = new JTextField();
		inputAutor.setColumns(10);
		inputAutor.setBounds(92, 89, 320, 20);
		contentPanel.add(inputAutor);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(26, 120, 56, 14);
		contentPanel.add(lblAno);
		
		inputAno = new JTextField();
		inputAno.setColumns(10);
		inputAno.setBounds(92, 117, 56, 20);
		contentPanel.add(inputAno);
		
		JLabel lblPginas = new JLabel("Páginas");
		lblPginas.setBounds(26, 151, 56, 14);
		contentPanel.add(lblPginas);
		
		inputPagina = new JTextField();
		inputPagina.setColumns(10);
		inputPagina.setBounds(92, 148, 56, 20);
		contentPanel.add(inputPagina);
		
		JLabel lblResenha = new JLabel("Resenha");
		lblResenha.setBounds(26, 179, 56, 14);
		contentPanel.add(lblResenha);
		
		JTextArea inputResenha = new JTextArea();
		inputResenha.setLineWrap(true);
		inputResenha.setBounds(92, 179, 320, 144);
		contentPanel.add(inputResenha);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCadastro.this.dispose();
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\back.png"));
		btnSair.setBounds(425, 343, 103, 33);
		contentPanel.add(btnSair);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				inputTitulo.setText("");
				inputCategoria.setText("");
				inputAutor.setText("");
				inputAno.setText("");
				inputPagina.setText("");
				inputResenha.setText("");
			}
		});
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\new-file.png"));
		btnCadastrar.setBounds(26, 343, 121, 33);
		contentPanel.add(btnCadastrar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\save.png"));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(inputTitulo.getText().isBlank()) {
					return;
				} else if (inputCategoria.getText().isBlank()) {
					DialogMessage message = new DialogMessage("Campo categoria vazio!");
					return;
				} else if (inputAutor.getText().isBlank()) {
					DialogMessage message = new DialogMessage("Campo autor vazio!");
					return;
				} else if(inputAno.getText().isBlank()) {
					DialogMessage message = new DialogMessage("Campo ano vazio!");
					return;
				} else if (inputPagina.getText().isBlank()) {
					DialogMessage message = new DialogMessage("Campo página vazio");
					return;
				} else if (inputResenha.getText().isBlank()) {
					DialogMessage message = new DialogMessage("Campo resenha vazio");
					return;
				} else {
					try {
						FileWriter fw = new FileWriter("C:/Users/vini6/Documents/ADS/Desenvolvimento-desktop/workspace-desktop/files/arquivo.txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write((String.format("%-20s", inputTitulo.getText())));
						bw.write((String.format("%-20s", inputCategoria.getText())));
						bw.write((String.format("%-20s", inputAutor.getText())));
						bw.write((String.format("%-8s", inputAno.getText())));
						bw.write((String.format("%-8s", inputPagina.getText())));
						bw.write((String.format("%-200s", inputResenha.getText())));
						System.out.println("Tudo certo!");
						bw.newLine();
						bw.close();
						DialogMessage message = new DialogMessage("Cadastrado com sucesso!");
						message.setLocationRelativeTo(null);
						message.setVisible(true);
					} catch (IOException error) {
						System.out.println("Erro ao adicionar arquivo: " + error.getMessage());
					}
				}
			}
		});
		btnSalvar.setBounds(231, 343, 121, 33);
		contentPanel.add(btnSalvar);
		
		JLabel lblCadastro = new JLabel("Cadastrar novo livro");
		lblCadastro.setBackground(Color.WHITE);
		lblCadastro.setForeground(Color.BLACK);
		lblCadastro.setFont(new Font("Ubuntu", Font.PLAIN, 22));
		lblCadastro.setBounds(153, 0, 229, 26);
		contentPanel.add(lblCadastro);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
