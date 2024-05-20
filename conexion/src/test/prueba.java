package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import controlador.UsuarioControlador;
import Modelo.Usuario;
public class prueba {

	@Test
	public void PruebaIniciarSesionV() {
		UsuarioControlador controlador = new UsuarioControlador();
		boolean flag=false;
		for (Usuario usuario : controlador.getAllUsers()) {
			if (usuario.IniciarSesion("Gamaliel", "Ghami@gmail.com")) {
				flag =true;
				break;
			} 
		}
		assertEquals(true,flag);

	}
	@Test
	public void PruebaIniciarSesionF() {
		UsuarioControlador controlador = new UsuarioControlador();
		boolean flag=false;
		for (Usuario usuario : controlador.getAllUsers()) {
			if (usuario.IniciarSesion("Gamaliel", "Ghami@gmail.com")) {
				flag =true;
				break;
			} 
		}
		assertEquals(true,flag);

	}
}
