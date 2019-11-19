package ejercicio19;

public class Autor {
	private String nombre;
	private String Apellidos;
	private String fechaNacimiento;
	
	
	@Override
	public String toString() {
		return "Autor: " + nombre + Apellidos + ", fecha de nacimiento: " + fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

}
