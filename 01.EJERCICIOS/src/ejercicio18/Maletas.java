package ejercicio18;

public class Maletas {
	private double peso;
	private String tipoMaleta;
	
	
	@Override
	public String toString() {
		return "Peso: " + peso + " y  tipo de Maleta: " + tipoMaleta;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTipoMaleta() {
		return tipoMaleta;
	}
	public void setTipoMaleta(String tipoMaleta) {
		this.tipoMaleta = tipoMaleta;
	}
	
}
