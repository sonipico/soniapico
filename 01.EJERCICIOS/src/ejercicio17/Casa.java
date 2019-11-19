package ejercicio17;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Casa {
	private double precio;
	private Persona duenio;
	private Direccion direccion;
	private ArrayList<Habitacion>listaHabitacion;
	
	@Override
	public String toString() {
		return "Precio: " + precio + " , due�o: " + duenio + " , direccion: " + direccion + " , listaHabitacion: "
				+ listaHabitacion ;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}
	public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}
	public Persona getDue�o() {
		return duenio;
	}
	public void setDue�o(Persona due�o) {
		this.duenio = due�o;
	}
	
}
