package conexion;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    	UsuarioControlador usuarioControlador = new UsuarioControlador();
    	
    	
    	
    	usuarioControlador.addUser(new Usuario("Gamaliel","Ghami@gmail.com"));
        List<Usuario> users = usuarioControlador.getAllUsers();
        
        JOptionPane.showMessageDialog(null, usuarioControlador.getUserById(1));
    }
}