package editor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaConexion {

	private JFrame frmInicio;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConexion window = new VentanaConexion();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaConexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setTitle("Conexi\u00F3n");
		frmInicio.getContentPane().setBackground(new Color(245, 245, 245));
		frmInicio.setBounds(100, 100, 296, 224);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicio.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(25, 30, 117, 20);
		frmInicio.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(25, 97, 117, 20);
		frmInicio.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(167, 52, 103, 23);
		frmInicio.getContentPane().add(btnIngresar);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(25, 11, 46, 14);
		frmInicio.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(25, 77, 69, 14);
		frmInicio.getContentPane().add(lblContrasea);
		
		JButton btnNuevoUsuario = new JButton("Soy nuevo");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNuevoUsuario.setBounds(167, 86, 103, 23);
		frmInicio.getContentPane().add(btnNuevoUsuario);
		
		JButton btnNewButton = new JButton("Olvid\u00E9 mi clave");
		btnNewButton.setBounds(25, 151, 117, 23);
		frmInicio.getContentPane().add(btnNewButton);
	}
}
