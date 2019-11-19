package ejercicio17;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		ArrayList<Habitacion>listaHabitacion = new ArrayList<Habitacion>();
		Direccion d= new Direccion();
		d.setTipoVia("Calle");
		d.setNombreVia("Oviedo");
		d.setNumeroVia("22");
		d.setCiudad("Madrid");
		d.setCp("28701");
		
		Persona p=new Persona();
		p.setNombre("Paco");
		p.setTelefono("670654987");
		p.setDireccion(d);
		
		
		Habitacion h1=new Habitacion();
		h1.setTipoHabitacion("Baño");
		h1.setM2(8);
		listaHabitacion.add(h1);
		Habitacion h2=new Habitacion();
		h2.setTipoHabitacion("Cocina");
		h2.setM2(10);
		listaHabitacion.add(h2);
		Habitacion h3=new Habitacion();
		h3.setTipoHabitacion("Salón");
		h3.setM2(15);
		listaHabitacion.add(h3);
		Habitacion h4=new Habitacion();
		h4.setTipoHabitacion("Dormitorio");
		h4.setM2(10);
		listaHabitacion.add(h4);
		
		Casa c=new Casa();
		c.setPrecio(600);
		c.setDueño(p);
		c.setDireccion(d);
		c.setListaHabitacion(listaHabitacion);
		
		/*
		 * maneras de cambiar los metros cuadrados del salon
		 * 1
		 */
		h3.setM2(60);
		//2
		listaHabitacion.get(1).setM2(60);
		//3
		c.getListaHabitacion().get(1).setM2(60);
		
		System.out.println(c);
		

	}

}
