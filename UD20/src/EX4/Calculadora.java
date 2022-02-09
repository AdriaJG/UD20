package EX4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField etNumero1;
	private JFormattedTextField etNumero2;
	private JFormattedTextField etResultado;
	private JButton bRestar;
	private JButton bMultiplicar;
	private JButton bDividir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		etNumero1 = new JFormattedTextField(new Double(0));
		etNumero1.setBounds(33, 48, 86, 20);
		contentPane.add(etNumero1);
		etNumero1.setColumns(10);

		etNumero2 = new JFormattedTextField(new Double(0));
		etNumero2.setBounds(127, 48, 86, 20);
		contentPane.add(etNumero2);
		etNumero2.setColumns(10);

		etResultado = new JFormattedTextField();
		etResultado.setBounds(223, 48, 86, 20);
		contentPane.add(etResultado);
		etResultado.setColumns(10);

		JButton bSumar = new JButton("Sumar");
		bSumar.setBounds(33, 79, 80, 80);
		contentPane.add(bSumar);

		bRestar = new JButton("Restar");
		bRestar.setBounds(127, 79, 80, 80);
		contentPane.add(bRestar);

		bMultiplicar = new JButton("Multiplicar");
		bMultiplicar.setBounds(33, 170, 80, 80);
		contentPane.add(bMultiplicar);

		bDividir = new JButton("Dividir");
		bDividir.setBounds(127, 170, 80, 80);
		contentPane.add(bDividir);

		bSumar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calculadora('+');
			}
		});

		bRestar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calculadora('-');
			}
		});

		bMultiplicar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calculadora('*');
			}
		});

		bDividir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Double.parseDouble(etNumero2.getText()) == 0) {
					JOptionPane.showInternalMessageDialog(null, "No se puede dividir entre 0");
				} else {
					calculadora('/');
				}
			}
		});

	}

	public void calculadora(char signo) {
		double num1 = Double.parseDouble(etNumero1.getText());
		double num2 = Double.parseDouble(etNumero2.getText());
		double resultado = 0;
		
		switch (signo) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-' :
			resultado = num1 - num2;
			break;
		case '*' :
			resultado = num1 * num2;
			break;
		case '/' :
			resultado = num1 / num2;
			break;
		default:
			break;
		}
		
		etResultado.setText(new Double(resultado).toString());
		//contentPane.repaint();
	}

}
