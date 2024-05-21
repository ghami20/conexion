package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Modelo.Usuario;
import controlador.UsuarioControlador;

public class IniciarSesionTest {

	@Test
	public void InicioCorrecto() {
		UsuarioControlador controlador = new UsuarioControlador();
		boolean flag = false;
		for (Usuario usuario : controlador.getAllUsers()) {
			if (usuario.IniciarSesion("Gamaliel", "Ghami@gmail.com")) {
				flag=true;
				break;
			}
		}
		assertEquals(true,flag);
	}
	@Test
	public void InicioIncorrecto() {
		UsuarioControlador controlador = new UsuarioControlador();
		boolean flag = false;
		for (Usuario usuario : controlador.getAllUsers()) {
			if (usuario.IniciarSesion("Giel", "Ghami@gmail.com")) {
				flag=true;
				break;
			}
		}
		assertEquals(false,flag);
		
	}
	
	
}
