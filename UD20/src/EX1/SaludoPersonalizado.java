package EX1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SaludoPersonalizado extends JFrame {

	private JPanel contentPane;
	private JTextField etNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaludoPersonalizado frame = new SaludoPersonalizado();
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
	public SaludoPersonalizado() {
		setTitle("SALUDADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tvSaludo = new JLabel("Pon el nombre de a quien saludar");
		tvSaludo.setBounds(133, 40, 167, 21);
		contentPane.add(tvSaludo);
		
		etNombre = new JTextField();
		etNombre.setBounds(133, 72, 167, 20);
		contentPane.add(etNombre);
		etNombre.setColumns(10);
		
		JButton bNombre = new JButton("Saludar");
		bNombre.setBounds(133, 103, 167, 23);
		contentPane.add(bNombre);
		
		bNombre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (etNombre.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "No has introducido el nombre", "Alerta" , JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Hola " + etNombre.getText());
				}
			}
		});
	}
}
