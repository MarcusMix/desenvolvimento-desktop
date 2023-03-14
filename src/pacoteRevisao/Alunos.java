package pacoteRevisao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Alunos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField alunosInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Alunos dialog = new Alunos(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Alunos(ArrayList<String> nomes) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			alunosInput = new JTextField();
			alunosInput.setBounds(64, 41, 299, 176);
			contentPanel.add(alunosInput);
			alunosInput.setColumns(10);
			for(int i = 0; i < nomes.size(); i++) {
				alunosInput.setText(alunosInput.getText()+ (i+1) + "°- " + nomes.get(i) + " ");
			}
		}
		{
			JLabel alunosLabel = new JLabel("Alunos: ");
			alunosLabel.setBounds(84, 16, 46, 14);
			contentPanel.add(alunosLabel);
		}
		setLocationRelativeTo(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
