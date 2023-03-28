package resolucao;

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
			dialog.setLocationRelativeTo(null);
			dialog.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FormCadastro() {
		setModal(true);
		setBounds(100, 100, 567, 433);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
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
		
		JButton btnSair = new JButton("Sair");
		btnSair.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\exit.png"));
		btnSair.setBounds(425, 343, 103, 33);
		contentPanel.add(btnSair);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\new-file.png"));
		btnCadastrar.setBounds(92, 343, 121, 33);
		contentPanel.add(btnCadastrar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
