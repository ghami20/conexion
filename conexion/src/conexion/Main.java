package conexion;

import java.util.List;

import javax.swing.JOptionPane;

import Modelo.Usuario;
import controlador.UsuarioControlador;

public class Main {
	public static void main(String[] args) {
		UsuarioControlador usuarioControlador = new UsuarioControlador();

		String[] opciones = { "Agregar usuario", "Ver usuario por id", "Ver usuarios en general", "Editar usuario",
				"Eliminar usuario","Salir" };
		int opcion = 0;
		do {

			opcion = JOptionPane.showOptionDialog(null, "Elegir opcion", null, 0, 0, null, opciones, opciones[0]);

			switch (opcion) {
			case 0:
				String nombre = JOptionPane.showInputDialog("Ingrese nombre");
				String mail = JOptionPane.showInputDialog("Ingrese mail");
				usuarioControlador.addUser(new Usuario(nombre, mail));
				break;
			case 1:
				String[] usuarios = new String[usuarioControlador.getAllUsers().size()];
				for (int i = 0; i < usuarios.length; i++) {
					usuarios[i] = Integer.toString(usuarioControlador.getAllUsers().get(i).getId());
				}

				String opcionselect = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
						usuarios, usuarios[0]);

				Usuario seleccionado = usuarioControlador.getUserById(Integer.parseInt(opcionselect));
				JOptionPane.showMessageDialog(null, seleccionado);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, usuarioControlador.getAllUsers());

				break;
			case 3:
				String[] usuarioss = new String[usuarioControlador.getAllUsers().size()];
				for (int i = 0; i < usuarioss.length; i++) {
					usuarioss[i] = Integer.toString(usuarioControlador.getAllUsers().get(i).getId());
				}

				String opcions = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
						usuarioss, usuarioss[0]);

				Usuario seleccionados = usuarioControlador.getUserById(Integer.parseInt(opcions));

				seleccionados.setNombre(JOptionPane
						.showInputDialog("Su nombre actual es " + seleccionados.getNombre() + "Ingrese uno nuevo: "));
				seleccionados.setEmail(JOptionPane
						.showInputDialog("Su mail actual es " + seleccionados.getEmail() + "Ingrese uno nuevo: "));

				usuarioControlador.updateUser(seleccionados);
				break;
			case 4:
				String[] usuariosss = new String[usuarioControlador.getAllUsers().size()];
				for (int i = 0; i < usuariosss.length; i++) {
					usuariosss[i] = Integer.toString(usuarioControlador.getAllUsers().get(i).getId());
				}

				String opcionselectss = (String) JOptionPane.showInputDialog(null, "Seleccione usuario", null, 0, null,
						usuariosss, usuariosss[0]);

				usuarioControlador.deleteUser(Integer.parseInt(opcionselectss));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Hasta la proxima");
				break;
			default:
				break;
			}
		} while (opcion != 5);

	}
}