package ejercicio18;

import java.util.ArrayList;

public class Pasajeros {
	private String Nombre;
	private String DNI;
	private String Telefono;
	private ArrayList<Maletas>listaMaletas;
	

	
	@Override
	public String toString() {
		return "Pasajeros de Nombre: " + Nombre + ", DNI: " + DNI + ", Telefono: " + Telefono + " y tipos de maleta: "
				+ listaMaletas;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public ArrayList<Maletas> getListaMaletas() {
		return listaMaletas;
	}
	public void setListaMaletas(ArrayList<Maletas> listaMaletas) {
		this.listaMaletas = listaMaletas;
	}
	
}
