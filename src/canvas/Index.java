package canvas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClient = new JMenu("Cliente");
		menuBar.add(mnClient);
		
		JMenuItem subRegisterClient = new JMenuItem("Cadastrar");
		mnClient.add(subRegisterClient);
		
		JMenuItem subListClient = new JMenuItem("Listagem");
		mnClient.add(subListClient);
		
		JMenu mnAdress = new JMenu("Endereço");
		menuBar.add(mnAdress);
		
		JMenuItem subRegisterAdress = new JMenuItem("Cadastrar");
		mnAdress.add(subRegisterAdress);
		
		JMenuItem subListAdress = new JMenuItem("Listagem");
		mnAdress.add(subListAdress);
		
		JMenu mnPhone = new JMenu("Telefone");
		menuBar.add(mnPhone);
		
		JMenuItem subRegisterPhone = new JMenuItem("Cadastrar");
		mnPhone.add(subRegisterPhone);
		
		JMenuItem subListPhone = new JMenuItem("Listagem");
		mnPhone.add(subListPhone);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
