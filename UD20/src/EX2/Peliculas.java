package EX2;

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
import javax.swing.JComboBox;

public class Peliculas extends JFrame {

	private JPanel contentPane;
	private JTextField etTituloPelicula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas frame = new Peliculas();
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
	public Peliculas() {
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tvTitulo = new JLabel("Titulo de la pelicula");
		tvTitulo.setBounds(61, 63, 106, 14);
		contentPane.add(tvTitulo);
		
		etTituloPelicula = new JTextField();
		etTituloPelicula.setBounds(61, 88, 106, 20);
		contentPane.add(etTituloPelicula);
		etTituloPelicula.setColumns(10);
		
		JButton bTituloPelicula = new JButton("A\u00F1adir pelicula");
		bTituloPelicula.setBounds(61, 119, 106, 23);
		contentPane.add(bTituloPelicula);
		
		JLabel tvPeliculas = new JLabel("Peliculas");
		tvPeliculas.setBounds(225, 63, 167, 14);
		contentPane.add(tvPeliculas);
		
		JComboBox cbPeliculas = new JComboBox();
		cbPeliculas.setBounds(225, 87, 167, 55);
		contentPane.add(cbPeliculas);
		
		bTituloPelicula.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (etTituloPelicula.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "No se ha introducido niguna pelicula", "Error", JOptionPane.WARNING_MESSAGE);
				} else {
					cbPeliculas.addItem(etTituloPelicula.getText());
					contentPane.repaint();
				}
			}
		});
	}
}
