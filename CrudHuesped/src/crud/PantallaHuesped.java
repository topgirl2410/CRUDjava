package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PantallaHuesped {

	private JFrame frame;
	private JTextField txtCodigoHuesped;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtCiudad;
	private JTextField txtNumTarjeta;
	private JTextField txtNumHabitacion;
	/**
	 * @wbp.nonvisual location=35,616
	 */
	private final JSpinner spinner = new JSpinner();
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_2;

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
		frame.setTitle("CRUD HUESPED");
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(110, 44, 121, 17);
		frame.getContentPane().add(lblCodigo);

		txtCodigoHuesped = new JTextField();
		txtCodigoHuesped.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCodigoHuesped.getText().length() >= 5) {
					e.consume();
				}
			}
		});
		txtCodigoHuesped.setBounds(249, 42, 114, 21);
		frame.getContentPane().add(txtCodigoHuesped);
		txtCodigoHuesped.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(110, 90, 102, 17);
		frame.getContentPane().add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNombre.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(249, 88, 114, 21);
		frame.getContentPane().add(txtNombre);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(110, 131, 102, 17);
		frame.getContentPane().add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtApellidos.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(249, 129, 114, 21);
		frame.getContentPane().add(txtApellidos);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(110, 175, 102, 17);
		frame.getContentPane().add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtDireccion.getText().length() >= 125) {
					e.consume();
				}
			}
		});
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(249, 173, 114, 21);
		frame.getContentPane().add(txtDireccion);

		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(110, 218, 102, 17);
		frame.getContentPane().add(lblCiudad);

		txtCiudad = new JTextField();
		txtCiudad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtCiudad.getText().length() >= 125) {
					e.consume();
				}
			}
		});
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(249, 216, 114, 21);
		frame.getContentPane().add(txtCiudad);

		JLabel lblNumTarjeta = new JLabel("Numero Tarjeta");
		lblNumTarjeta.setBounds(110, 264, 102, 17);
		frame.getContentPane().add(lblNumTarjeta);

		txtNumTarjeta = new JTextField();
		txtNumTarjeta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNumTarjeta.getText().length() >= 30) {
					e.consume();
				}
			}
		});
		txtNumTarjeta.setColumns(10);
		txtNumTarjeta.setBounds(249, 262, 114, 21);
		frame.getContentPane().add(txtNumTarjeta);

		JLabel lblNumHabitacion = new JLabel("Numero Habitacion");
		lblNumHabitacion.setBounds(110, 307, 102, 17);
		frame.getContentPane().add(lblNumHabitacion);

		txtNumHabitacion = new JTextField();
		txtNumHabitacion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (txtNumHabitacion.getText().length() >= 3) {
					e.consume();
				}
			}
		});
		txtNumHabitacion.setColumns(10);
		txtNumHabitacion.setBounds(249, 305, 114, 21);
		frame.getContentPane().add(txtNumHabitacion);

		btnNewButton = new JButton("Insertar");
		btnNewButton.setBounds(22, 467, 105, 27);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("Cargar");
		btnNewButton_1.setBounds(154, 467, 105, 27);
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_1_1 = new JButton("Eliminar");
		btnNewButton_1_1.setBounds(295, 467, 105, 27);
		frame.getContentPane().add(btnNewButton_1_1);

		btnNewButton_1_2 = new JButton("Actualizar");
		btnNewButton_1_2.setBounds(432, 467, 105, 27);
		frame.getContentPane().add(btnNewButton_1_2);

		JList list = new JList();
		list.setBounds(169, 405, 1, 1);
		frame.getContentPane().add(list);
	}
}
