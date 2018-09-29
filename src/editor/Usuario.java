package editor;

import java.util.ArrayList;

public class Usuario {
	private String mail;
	private String clave;
	private ArrayList<Usuario> amigos;
	
	public Usuario(String mail, String clave) {
		this.mail = mail;
		this.clave = clave;
	}
	
	public void añadirAmigo(Usuario amigo)
	{
		amigos.add(amigo);
	}
	
	/**
	 * Cambiar la clave del usuario.
	 * Este metodo se usa una vez se ha validado la nuevaClave.
	 * @param nuevaClave : Clave en formato String.
	 */
	public void cambiarClave(String nuevaClave)
	{
		this.clave = nuevaClave;
	}
	
	/**
	 * Comprobacion de la clave. Este metodo es estatico porque no se necesitara
	 * de un objeto para usarlo, sino de la clase misma.
	 * 1) Validar la clave con este metodo de la clase.
	 * 2) Cambiar la clave una vez validada con cambiarClave del usuario en cuestion.
	 * @param clave : Clave a validar en formato String
	 * @return Booleano segun se pueda validar o no.
	 * El criterio de validacion se puede seguir restringiendo mas adelante.
	 */
	public static boolean esClaveValida(String clave)
	{
		return clave.length()>=8; 
	}
}
