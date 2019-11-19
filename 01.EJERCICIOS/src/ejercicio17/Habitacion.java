package ejercicio17;

public class Habitacion {
	private String tipoHabitacion;
	private double m2;
	
	@Override
	public String toString() {
		return "Tipo de habitacion: " + tipoHabitacion + " con  m2: " + m2 + ".";
	}
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	
}
