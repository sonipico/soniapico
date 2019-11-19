package ejercicio19;

public class Libro {
	private String ISBN;
	private String titulo;
	private String editorial;
	private Autor autor;
	
	
	@Override
	public String toString() {
		return "Libro:"
				+ " ISBN: " + ISBN + 
				" titulo: " + titulo + 
				" editorial: " + editorial + ""
				+ " autor: " + autor ;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
