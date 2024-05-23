package test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import org.junit.Test;

import Modelo.Servicio;
import controlador.ServicioControlador;

public class TestServicio {
	@Test
	public void GuardarServicio() {
		
		ServicioControlador controlador = new ServicioControlador();
		
		
		assertEquals(controlador.addService(new Servicio("Moji","Vacunación",LocalDate.of(2024, 7, 7))),true);
	}
	
	@Test
	public void ProbarServicios() {
		
		ServicioControlador controlador = new ServicioControlador();
			boolean flag = true;
		if (controlador.getAllServices().isEmpty()) {
			flag =false;
		} else {
			JOptionPane.showMessageDialog(null, controlador.getAllServices());
		}
		
		assertEquals(flag,true);
		
	}
	
}
