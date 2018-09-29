package editor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ConexionDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConexionDialog dialog = new ConexionDialog();
			dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConexionDialog() {
		setTitle("Conexi\u00F3n");
		setBounds(100, 100, 334, 218);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 34, 122, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(24, 11, 46, 14);
		contentPanel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(24, 76, 76, 14);
		contentPanel.add(lblContrasea);
		
		JButton btnSoyNuevo = new JButton("Soy nuevo");
		btnSoyNuevo.setBounds(180, 79, 108, 23);
		contentPanel.add(btnSoyNuevo);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(180, 45, 108, 23);
		contentPanel.add(btnIngresar);
		
		JButton btnNewButton = new JButton("Olvid\u00E9 mi clave");
		btnNewButton.setBounds(24, 134, 122, 23);
		contentPanel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(24, 101, 122, 20);
		contentPanel.add(passwordField);
	}
}
