package ejercicio18;

import java.util.ArrayList;

import ejercicio18.Avion;

public class Avion {
	private String tipoAvion;
	private ArrayList<Pasajeros>listaPasajeros;
	private ArrayList<Asientos>listaAsientos;
	
	
	@Override
	public String toString() {
		return "Tipo de avion: " + tipoAvion + " , con lista de Pasajeros: " + listaPasajeros + " y  lista de Asientos: "
				+ listaAsientos;
	}
	public ArrayList<Pasajeros> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(ArrayList<Pasajeros> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	public ArrayList<Asientos> getListaAsientos() {
		return listaAsientos;
	}
	public void setListaAsientos(ArrayList<Asientos> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public int contarPasajeros() {
		return getListaPasajeros().size();
	}
	public int contarMaletas() {
		int n=0;
		for (Pasajeros p:getListaPasajeros()) {
			n=n+p.getListaMaletas().size();
		}
		return n;
	}
	public int contarMaletasDeTipo(String tipo) {
		int n=0;
		for (Pasajeros p:getListaPasajeros()) {
			for (Maletas m : p.getListaMaletas()) {
				if(m.getTipoMaleta().equalsIgnoreCase(tipo)) {
					n++;
				}
			}
		}
		return n;
	}

}
