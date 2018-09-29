package editor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					ConexionDialog conexion = new ConexionDialog();
					conexion.setModal(true);
					conexion.setVisible(true);
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
	public Principal() {
		setTitle("Editor de texto multiusuario"); // Titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Salir del programa al cerrar la ventana (posteriormente se cambiara)
		setBounds(100, 100, 450, 300); // Tamaño de la ventana 
		contentPane = new JPanel(); // Panel contenedor
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
