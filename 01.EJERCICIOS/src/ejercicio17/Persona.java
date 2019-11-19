package ejercicio17;

public class Persona {
	private String nombre;
	private String telefono;
	private Direccion direccion;
	//private String direccion;
	
	
	public String getNombre() {
		return nombre;
	}
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", telefono: " + telefono +  ", direccion: " + direccion  ;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/*public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}*/
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
