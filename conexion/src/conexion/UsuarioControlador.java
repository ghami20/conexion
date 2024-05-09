
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioControlador implements UserRepository {
    private final Connection connection;

    public UsuarioControlador() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public List<Usuario> getAllUsers() {
        List<Usuario> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users ");
            ResultSet resultSet = statement.executeQuery();
       
            while (resultSet.next()) {
            	Usuario user = new Usuario(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public Usuario getUserById(int id) {
        Usuario user = null;
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                user = new Usuario(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

	@Override
    public void addUser(Usuario usuario) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)");
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Usuario insertado exitosamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
    public void updateUser(Usuario usuario) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE users SET name = ?, email = ? WHERE id = ?");
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.setInt(3, usuario.getId());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Usuario actualizado exitosamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
            statement.setInt(1, id);
            
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Usuario eliminado exitosamente");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


  
}
