package exemplosSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFramer extends JFrame {

	private JPanel contentPane;
	private JTextField inputNum;
	private JTextField inputDeno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFramer frame = new MainFramer();
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
	public MainFramer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblText = new JLabel("Numerador");
		lblText.setBounds(53, 52, 78, 14);
		contentPane.add(lblText);
		
		JLabel lblDeno = new JLabel("Denominador");
		lblDeno.setBounds(53, 95, 68, 14);
		contentPane.add(lblDeno);
		
		inputNum = new JTextField();
		inputNum.setBounds(138, 49, 86, 20);
		contentPane.add(inputNum);
		inputNum.setColumns(10);
		
		inputDeno = new JTextField();
		inputDeno.setBounds(138, 92, 86, 20);
		contentPane.add(inputDeno);
		inputDeno.setColumns(10);

		JLabel lblDiv = new JLabel("Divisão");
		lblDiv.setBounds(53, 196, 46, 14);
		contentPane.add(lblDiv);
		
		JLabel lblRest = new JLabel("Resto");
		lblRest.setBounds(53, 236, 46, 14);
		contentPane.add(lblRest);
		
		JLabel lblDivRes = new JLabel("0");
		lblDivRes.setBounds(128, 196, 46, 14);
		contentPane.add(lblDivRes);
		
		JLabel lblResto = new JLabel("0");
		lblResto.setBounds(128, 236, 46, 14);
		contentPane.add(lblResto);
		
		JButton btnDiv = new JButton("Dividir");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float denominador = Float.parseFloat(inputDeno.getText());
				float numerador = Float.parseFloat(inputNum.getText());
				float resultado = numerador / numerador;
				float resto = numerador % numerador;
				lblDivRes.setText(Float.toString(resultado));
				lblResto.setText(Float.toString(resto));
			}
		});
		btnDiv.setBounds(85, 135, 89, 23);
		contentPane.add(btnDiv);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputDeno.setText("");
				inputNum.setText("");
			}
		});
		btnLimpar.setBounds(249, 135, 89, 23);
		contentPane.add(btnLimpar);
		
	}
}
