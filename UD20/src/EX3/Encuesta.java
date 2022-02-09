package EX3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.JButton;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup bgSistemas = new ButtonGroup();
	private ArrayList<JCheckBox> checkB = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta frame = new Encuesta();
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
	public Encuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tvSistema = new JLabel("Elija un sistema operativo");
		tvSistema.setBounds(10, 11, 131, 14);
		contentPane.add(tvSistema);
		
		JRadioButton rbWindows = new JRadioButton("Windows");
		bgSistemas.add(rbWindows);
		rbWindows.setBounds(20, 32, 109, 23);
		contentPane.add(rbWindows);
		rbWindows.setActionCommand(rbWindows.getText());
		
		JRadioButton rbLinux = new JRadioButton("Linux");
		bgSistemas.add(rbLinux);
		rbLinux.setBounds(20, 58, 109, 23);
		contentPane.add(rbLinux);
		rbLinux.setActionCommand(rbLinux.getText());
		
		JRadioButton rbMacOS = new JRadioButton("MacOS");
		bgSistemas.add(rbMacOS);
		rbMacOS.setBounds(20, 84, 109, 23);
		contentPane.add(rbMacOS);
		rbMacOS.setActionCommand(rbMacOS.getText());
		
		JLabel tvEspecialidad = new JLabel("Elige tu especialidad");
		tvEspecialidad.setBounds(10, 114, 119, 14);
		contentPane.add(tvEspecialidad);
		
		JCheckBox chbProgramador = new JCheckBox("Programacion");
		chbProgramador.setBounds(20, 135, 97, 23);
		checkB.add(chbProgramador);
		
		JCheckBox chbDiseño = new JCheckBox("Dise\u00F1o Grafico");
		chbDiseño.setBounds(20, 161, 97, 23);
		checkB.add(chbDiseño);
		
		JCheckBox chbAdministrador = new JCheckBox("Administracion");
		chbAdministrador.setBounds(20, 187, 97, 23);
		checkB.add(chbAdministrador);
		
		for (int i = 0; i < checkB.size(); i++) {
			contentPane.add(checkB.get(i));
		}
		
		JLabel tvHorasDrdenador = new JLabel("Introduce cuantas horas estas en el ordenador");
		tvHorasDrdenador.setBounds(177, 11, 226, 14);
		contentPane.add(tvHorasDrdenador);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner.setBounds(177, 33, 54, 20);
		contentPane.add(spinner);
		
		JButton bResultado = new JButton("Mostrar resultados.");
		bResultado.setBounds(149, 227, 131, 23);
		contentPane.add(bResultado);
		
		bResultado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String resultado = "Sistema operativo:"
						+ bgSistemas.getSelection().getActionCommand() + "\n";
				resultado += "Especialidades:";
				for (int i = 0; i < checkB.size(); i++) {
					if (checkB.get(i).isSelected()) {
						resultado += checkB.get(i).getText() + ", ";
					}
				}
				resultado += "\n";
				resultado += "Horas dedicadas al ordenador:" + spinner.getValue();
				JOptionPane.showMessageDialog(null,resultado);
			}
		});
		
	}
}
