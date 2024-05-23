package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Interfaces.ServiceRepository;
import Modelo.Servicio;
import Modelo.Usuario;

public class ServicioControlador implements ServiceRepository{
	  private final Connection connection;

	    public ServicioControlador() {
	        this.connection = DatabaseConnection.getInstance().getConnection();
	    }

		@Override
		public List<Servicio> getAllServices() {
			 List<Servicio> servicios = new ArrayList<>();
		        try {
		            PreparedStatement statement = connection.prepareStatement("SELECT * FROM servicio ");
		            ResultSet resultSet = statement.executeQuery();
		       
		            while (resultSet.next()) {
		            	Servicio servicio = new Servicio(
		            			resultSet.getInt("id")
		            			,resultSet.getString("nombre"),
		            			resultSet.getString("tipo"),
		            			resultSet.getDate("fecha").toLocalDate());
		            	servicios.add(servicio);
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		        return servicios;
		}

		@Override
		public Servicio getServiceById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean addService(Servicio Service) {
			try {
	            PreparedStatement statement = connection.prepareStatement("INSERT INTO `servicio`(`nombre`, `tipo`, `fecha`) VALUES (?,?,?)");
	            statement.setString(1, Service.getNombreMascota());
	            statement.setString(2, Service.getTipoServicio());
	            statement.setDate(3,Date.valueOf( Service.getFecha()));

	            int rowsInserted = statement.executeUpdate();
	            if (rowsInserted > 0) {
	                System.out.println("Servicio insertado exitosamente");
	            }
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;

	        }			
		}

		@Override
		public void updateService(Servicio Service) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteService(int id) {
			// TODO Auto-generated method stub
			
		}
	    
	    
}
