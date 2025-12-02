package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;

public class PantallaHuesped {

	private JFrame frame;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textCiudad;
	private JTextField textNumTarjeta;
	private JTextField textNumHabitacion;
	/**
	 * @wbp.nonvisual location=35,616
	 */
	private final JSpinner spinner = new JSpinner();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaHuesped window = new PantallaHuesped();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaHuesped() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setName("CRUD HUESPED");
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(110, 44, 121, 17);
		frame.getContentPane().add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(249, 42, 114, 21);
		frame.getContentPane().add(textCodigo);
		textCodigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(110, 90, 102, 17);
		frame.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(249, 88, 114, 21);
		frame.getContentPane().add(textNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(110, 131, 102, 17);
		frame.getContentPane().add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(249, 129, 114, 21);
		frame.getContentPane().add(textApellidos);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(110, 175, 102, 17);
		frame.getContentPane().add(lblDireccion);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(249, 173, 114, 21);
		frame.getContentPane().add(textDireccion);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(110, 218, 102, 17);
		frame.getContentPane().add(lblCiudad);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(249, 216, 114, 21);
		frame.getContentPane().add(textCiudad);
		
		JLabel lblNumTarjeta = new JLabel("Numero Tarjeta");
		lblNumTarjeta.setBounds(110, 264, 102, 17);
		frame.getContentPane().add(lblNumTarjeta);
		
		textNumTarjeta = new JTextField();
		textNumTarjeta.setColumns(10);
		textNumTarjeta.setBounds(249, 262, 114, 21);
		frame.getContentPane().add(textNumTarjeta);
		
		JLabel lblNumHabitacion = new JLabel("Numero Habitacion");
		lblNumHabitacion.setBounds(110, 307, 102, 17);
		frame.getContentPane().add(lblNumHabitacion);
		
		textNumHabitacion = new JTextField();
		textNumHabitacion.setColumns(10);
		textNumHabitacion.setBounds(249, 305, 114, 21);
		frame.getContentPane().add(textNumHabitacion);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setBounds(22, 467, 105, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Actualizar");
		btnNewButton_1.setBounds(154, 467, 105, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Eliminar");
		btnNewButton_1_1.setBounds(295, 467, 105, 27);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Limpiar");
		btnNewButton_1_2.setBounds(432, 467, 105, 27);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JList list = new JList();
		list.setBounds(169, 405, 1, 1);
		frame.getContentPane().add(list);
	}
}
