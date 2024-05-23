package Interfaces;

import java.util.List;

import Modelo.Servicio;

public interface ServiceRepository {
	
    List<Servicio> getAllServices();
    
    Servicio getServiceById(int id); 
    
    boolean addService(Servicio Service); 
    
    void updateService(Servicio Service); 
    
    void deleteService(int id);
}
