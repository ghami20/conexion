package conexion;

import java.util.List;

public interface UserRepository {
	//prototipos de metodos 
    List<Usuario> getAllUsers(); // llama a todos los usuarios de la bdd
    
    Usuario getUserById(int id); //llama solo a uno, por su id
    
    void addUser(Usuario user); //añade usuarios a la bdd
    
    void updateUser(Usuario user); //actualiza los usuarios de la bdd
    
    void deleteUser(int id); //eliminar usuarios de la bdd
}
