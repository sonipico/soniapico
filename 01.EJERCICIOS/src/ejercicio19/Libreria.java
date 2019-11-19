package ejercicio19;

import java.util.ArrayList;



public class Libreria {
	private ArrayList<Libro>listaLibros;

	@Override
	public String toString() {
		return "Lista de libros: " + listaLibros;
	}

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	public Libro mostrarlbro(String ISBN) {
		for (Libro l : getListaLibros()) {
			if(l.getISBN().equalsIgnoreCase(ISBN)) {
				return l;
			}
		}
		return null;
	}
	public ArrayList<Libro> mostrarLibro(String titulo) {
		ArrayList<Libro>mostrarLibroTitulo=new ArrayList<Libro>();
		for(Libro i:listaLibros) {
			if(i.getEditorial().equalsIgnoreCase(titulo)) {
				mostrarLibroTitulo.add(i);
			}
		}
		return mostrarLibroTitulo;
	}
	public ArrayList<Libro> mostrarLibroEditotial(String editorial) {
		ArrayList<Libro>mostrarLibroEditotial=new ArrayList<Libro>();
		for(Libro i:listaLibros) {
			if(i.getEditorial().equalsIgnoreCase(editorial)) {
				mostrarLibroEditotial.add(i);
			}
		}
		return mostrarLibroEditotial;
	}
	public ArrayList<Libro> mostrarLibroAutor(String Nombre){
		ArrayList<Libro>mostrarLibroAutor=new ArrayList<Libro>();
		for(Libro i:listaLibros) {
			if(i.getAutor().getNombre().equalsIgnoreCase(Nombre)) {
				mostrarLibroAutor.add(i);
			}
		}
		return mostrarLibroAutor;
	}
	
}
