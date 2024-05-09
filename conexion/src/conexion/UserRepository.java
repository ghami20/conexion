package conexion;

import java.util.List;

public interface UserRepository {
    List<Usuario> getAllUsers();
    Usuario getUserById(int id);
    void addUser(Usuario user);
    void updateUser(Usuario user);
    void deleteUser(int id);
}
