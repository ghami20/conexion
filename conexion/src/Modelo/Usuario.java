package Modelo;

public class Usuario {
	private int id;
	private String nombre;
	private String email;
	public Usuario(int id, String nombre, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}
	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
	}
	public boolean IniciarSesion(String nombre,String mail) {
		if (nombre.length()>=8 && mail.length()>=8) {
				
			if (this.getEmail().equals(mail)){
				if( this.getNombre().equals(nombre)) {
					return true;
				} else {
					//Error nombre
					return false;
				}
						
			} else {
				//Error mail
				return false;
			}
		} else {
			return false;
	
		}
	}
	
}
