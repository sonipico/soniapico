package ejercicio17;

public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String numeroVia;
	private String cp;
	private String ciudad;
	
	@Override
	public String toString() {
		return "Tipo de Via es " + tipoVia+ " " + nombreVia + ", con numero de Via " + numeroVia + " y  codigo postal " + cp
				+ " y  ciudad " + ciudad + ".";
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getNumeroVia() {
		return numeroVia;
	}
	public void setNumeroVia(String numeroVia) {
		this.numeroVia = numeroVia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
