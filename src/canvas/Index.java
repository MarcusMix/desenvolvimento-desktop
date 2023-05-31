package canvas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnClient;
	private JMenuItem subRegisterClient;
	private JMenuItem subListClient;
	private JMenu mnAdress;
	private JMenuItem subListPhone;
	private JMenuItem subRegisterPhone;
	private JMenu mnPhone;
	private JMenuItem subListAdress;
	private JMenuItem subRegisterAdress;
	private JPanel PanelRegisterClient;

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
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnClient = new JMenu("Cliente");
		menuBar.add(mnClient);
		
		subRegisterClient = new JMenuItem("Cadastrar");
		subRegisterClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelRegisterClient registerClient = new PanelRegisterClient();
				setContentPane(registerClient);
				revalidate();
			}
		});
		mnClient.add(subRegisterClient);
		
		subListClient = new JMenuItem("Listagem");
		mnClient.add(subListClient);
		
		mnAdress = new JMenu("Endereço");
		menuBar.add(mnAdress);
		
		subRegisterAdress = new JMenuItem("Cadastrar");
		mnAdress.add(subRegisterAdress);
		
		subListAdress = new JMenuItem("Listagem");
		mnAdress.add(subListAdress);
		
		mnPhone = new JMenu("Telefone");
		menuBar.add(mnPhone);
		
		subRegisterPhone = new JMenuItem("Cadastrar");
		mnPhone.add(subRegisterPhone);
		
		subListPhone = new JMenuItem("Listagem");
		mnPhone.add(subListPhone);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
