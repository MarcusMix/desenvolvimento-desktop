package resolucao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.Font;

public class FormPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPrincipal frame = new FormPrincipal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 */
	public FormPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\menu.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCadastro cadastro = new FormCadastro();
				cadastro.setVisible(true);				
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\new-file.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Pesquisar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormPesquisa pesquisa = new FormPesquisa();
				pesquisa.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\search.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormPrincipal.this.dispose();
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\exit.png"));
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 262, 584, 19);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Livros (48) 9999-9999");
		lblNewLabel_1.setBounds(212, 0, 194, 19);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Open Sans", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vini6\\Documents\\ADS\\Desenvolvimento-desktop\\workspace-desktop\\images\\shelf 1.png"));
		lblNewLabel.setBounds(0, 0, 291, 270);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastro de Livros");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 31));
		lblNewLabel_2.setBounds(311, 0, 273, 59);
		contentPane.add(lblNewLabel_2);
	}
}
