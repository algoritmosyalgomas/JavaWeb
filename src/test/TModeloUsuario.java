package test;

import entidad.Usuario;
import modelo.ModeloUsuario;

public class TModeloUsuario {
	public static void main(String[] args) {
		ModeloUsuario modeloUsuario = new ModeloUsuario();
		Usuario usuario = modeloUsuario.iniciarSesion("luis", "123");
		if (usuario == null) {
			System.out.println("No pudo iniciar sesi�n");
		} else {
			System.out.println("Bienvenido");
		}
	}
}
