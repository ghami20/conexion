package Modelo;

import java.time.LocalDate;

public class Servicio {
	private int id;
	private String nombreMascota;
	private String tipoServicio;
	private LocalDate fecha;
	public Servicio(int id,String nombreMascota, String tipoServicio, LocalDate fecha) {
		super();
		this.id=id;
		this.nombreMascota = nombreMascota;
		this.tipoServicio = tipoServicio;
		this.fecha = fecha;
	}
	public Servicio(String nombreMascota, String tipoServicio, LocalDate fecha) {
		
		this.nombreMascota = nombreMascota;
		this.tipoServicio = tipoServicio;
		this.fecha = fecha;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Servicio [nombreMascota=" + nombreMascota + ", tipoServicio=" + tipoServicio + ", fecha=" + fecha + "]";
	}
	
	
	
}
