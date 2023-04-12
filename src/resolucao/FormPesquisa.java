package resolucao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JEditorPane;

public class FormPesquisa extends JDialog {

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
			FormPesquisa dialog = new FormPesquisa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormPesquisa() {
		setModal(true);
		setBounds(100, 100, 615, 556);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
	
		
		JLabel lblNewLabel = new JLabel("Dados do livro");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(196, 79, 152, 46);
		contentPanel.add(lblNewLabel);
		
		JLabel lblResenha = new JLabel("Resenha");
		lblResenha.setBounds(110, 338, 56, 14);
		contentPanel.add(lblResenha);
		
		inputCategoria = new JTextField();
		inputCategoria.setColumns(10);
		inputCategoria.setBounds(110, 139, 320, 20);
		contentPanel.add(inputCategoria);
		
		JTextArea inputResenha = new JTextArea();
		inputResenha.setLineWrap(true);
		inputResenha.setBounds(110, 363, 320, 123);
		contentPanel.add(inputResenha);
		
		JLabel lblPesquisarLivros = new JLabel("Pesquisar livros");
		lblPesquisarLivros.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblPesquisarLivros.setBounds(196, 0, 152, 39);
		contentPanel.add(lblPesquisarLivros);
		
		JLabel lblTitulo = new JLabel("Título do livro");
		lblTitulo.setBounds(109, 50, 103, 14);
		contentPanel.add(lblTitulo);
		
		inputTitulo = new JTextField();
		inputTitulo.setBounds(196, 40, 249, 33);
		contentPanel.add(inputTitulo);
		inputTitulo.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(110, 115, 56, 14);
		contentPanel.add(lblCategoria);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(110, 170, 56, 14);
		contentPanel.add(lblAutor);
		
		inputAutor = new JTextField();
		inputAutor.setColumns(10);
		inputAutor.setBounds(110, 195, 320, 20);
		contentPanel.add(inputAutor);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(110, 226, 56, 14);
		contentPanel.add(lblAno);
		
		inputAno = new JTextField();
		inputAno.setColumns(10);
		inputAno.setBounds(110, 251, 56, 20);
		contentPanel.add(inputAno);
		
		JLabel lblPginas = new JLabel("Páginas");
		lblPginas.setBounds(110, 282, 56, 14);
		contentPanel.add(lblPginas);
		
		inputPagina = new JTextField();
		inputPagina.setColumns(10);
		inputPagina.setBounds(110, 307, 56, 20);
		contentPanel.add(inputPagina);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormPesquisa.this.dispose();
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\exit.png"));
		btnSair.setBounds(459, 453, 103, 33);
		contentPanel.add(btnSair);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

	
			try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/vini6/Documents/ADS/Desenvolvimento-desktop/workspace-desktop/files/arquivo.txt"))){
				String linha;
				while ((linha = br.readLine()) != null) {
						String titulo = linha.substring(0, 19).trim();
						if(inputTitulo.getText().equals(titulo)) {
							String categoria = linha.substring(20, 39).trim();
							String autor = linha.substring(40, 59).trim();
							String ano = linha.substring(60, 64).trim();
							String pagina = linha.substring(64, 67).trim();
							String resenha = linha.substring(68, 200).trim();
							inputCategoria.setText(categoria);
							inputAutor.setText(autor);
							inputAno.setText(ano);
							inputPagina.setText(pagina);
							inputResenha.setText(resenha);
						}
							
					}
			} catch (IOException error) {
				System.out.println("Erro ao ler arquivo: " + error.getMessage());
			}
		}	
		});
		btnPesquisar.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\search.png"));
		btnPesquisar.setBounds(441, 40, 121, 33);
		contentPanel.add(btnPesquisar);
	}
}
