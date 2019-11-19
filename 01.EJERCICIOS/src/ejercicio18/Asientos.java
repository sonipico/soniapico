package ejercicio18;

public class Asientos {
	private String tipoAsiento;
	private String posicion;
	private String fila;
	private Pasajeros pasajero;
	
	
	@Override
	public String toString() {
		return "Tipo de Asiento: " + tipoAsiento + " , con posicion: " + posicion + fila + " , asignado al pasajero: "
				+ pasajero;
	}
	public String getTipoAsiento() {
		return tipoAsiento;
	}
	public void setTipoAsiento(String tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public Pasajeros getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajeros pasajero) {
		this.pasajero = pasajero;
	}

	
}
