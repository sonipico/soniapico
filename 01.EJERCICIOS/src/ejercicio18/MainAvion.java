package ejercicio18;

import java.util.ArrayList;

import ejercicio18.MainAvion;

public class MainAvion {

	public static void main(String[] args) {

		ArrayList<Maletas> listaMaletas = new ArrayList<Maletas>();
		Maletas m1 = new Maletas();
		m1.setPeso(50);
		m1.setTipoMaleta("Grande");
		listaMaletas.add(m1);
		Maletas m2 = new Maletas();
		m2.setPeso(15);
		m2.setTipoMaleta("De mano");
		listaMaletas.add(m2);
		

		ArrayList<Maletas> listaMaletas1 = new ArrayList<Maletas>();
		Maletas m3 = new Maletas();
		m3.setPeso(20);
		m3.setTipoMaleta("Pequeña");
		listaMaletas1.add(m3);
		Maletas m4 = new Maletas();
		m4.setPeso(15);
		m4.setTipoMaleta("De mano");
		listaMaletas1.add(m4);

		ArrayList<Pasajeros> listaPasajeros = new ArrayList<Pasajeros>();
		Pasajeros p1 = new Pasajeros();
		p1.setNombre("Laura");
		p1.setDNI("53497802X");
		p1.setTelefono("+34 879654783");
		p1.setListaMaletas(listaMaletas);
		listaPasajeros.add(p1);
		Pasajeros p2 = new Pasajeros();
		p2.setNombre("Paco");
		p2.setDNI("897067546X");
		p2.setTelefono("+34 345678092");
		p2.setListaMaletas(listaMaletas1);
		listaPasajeros.add(p2);
		
		System.out.println(listaPasajeros.get(0).getListaMaletas().get(0).getTipoMaleta());

		ArrayList<Asientos> listaAsientos = new ArrayList<Asientos>();
		Asientos a1 = new Asientos();
		a1.setTipoAsiento("Clase Turista");
		a1.setPosicion("A");
		a1.setFila("19");
		a1.setPasajero(p1);
		listaAsientos.add(a1);
		Asientos a2 = new Asientos();
		a2.setTipoAsiento("Clase Turista");
		a2.setPosicion("E");
		a2.setFila("17");
		a2.setPasajero(p2);
		listaAsientos.add(a2);

		Avion avion = new Avion();
		avion.setTipoAvion("Transatlántico");
		avion.setListaPasajeros(listaPasajeros);
		avion.setListaAsientos(listaAsientos);
		
		System.out.println(avion.getListaPasajeros().size());
		System.out.println(listaAvion(avion));
		System.out.println(avion.contarPasajeros());
		System.out.println(avion.getListaPasajeros().get(0).getListaMaletas().size());
		System.out.println(avion.getListaPasajeros().get(1).getListaMaletas().size());
		System.out.println(avion.contarMaletas());
		System.out.println(avion.contarMaletasDeTipo("De mano"));
		System.out.println(avion.contarMaletasDeTipo("grande"));
		System.out.println(avion.contarMaletasDeTipo("pequeña"));
		System.out.println(avion);

	}
	public static int listaAvion (Avion avion){
		return avion.getListaPasajeros().size();
		
	}
	
}
