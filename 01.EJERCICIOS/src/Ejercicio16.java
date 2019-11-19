import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		int opcion=0;
		double puntuacion=0;
		Scanner sc = new Scanner(System.in);
		ArrayList<PeliculaBean> listapeliculas = new ArrayList<PeliculaBean>();
		System.out.println("Buenos d�as, bienvenido al registro de pel�culas.");
		do {
			menu();
			opcion = leerNumero(sc);
			if(opcion==1) {
				System.out.println("Ha escogido introducir una pel�cula nueva");
				System.out.println("Introduzca la pel�cula.");
				String titulo = leerDatos("titulo:",sc);
				String genero = leerDatos("genero:",sc);
				String director = leerDatos("director:",sc);
				System.out.println("Introduzca una puntuaci�n:");
				puntuacion=sc.nextDouble();
				PeliculaBean p= new PeliculaBean();
				p.setTitulo(titulo);
				p.setGenero(genero);
				p.setDirector(director);
				p.setPuntuacion(puntuacion);
				listapeliculas.add(p);
				sc.nextLine();
			}
			else if(opcion==2){
				System.out.println("Ha escogido mostrar el listado de pel�culas");
				recorrerArray(listapeliculas);
			}
		}while(opcion != 0);
		
		System.out.println("Ha escogido salir del programa.");
	}
	public static void menu() {
		System.out.println();
		System.out.println("MEN�");
		System.out.println("1-Alta pel�culas");
		System.out.println("2-Listado de pel�culas");
		System.out.println("0-Salir del programa");
		System.out.println();
	}
	public static int leerNumero(Scanner sc) {
		System.out.println("Introduzca un numero: ");
		String opcion=sc.nextLine();
		int opcion1=Integer.parseInt(opcion);
		return opcion1;
	}
	public static String leerDatos(String cadena, Scanner sc) {
		System.out.println("Introduzca " + cadena);
		String dato = sc.nextLine();
		return dato;
	}
	public static void recorrerArray(ArrayList<PeliculaBean> listapeliculas) {
		for (PeliculaBean p : listapeliculas) {
			mostrarPeliculas(p);
		}
	}
	public static void mostrarPeliculas(PeliculaBean p) {
	System.out.println();
	System.out.println("Nombre de la pelicula: "+ p.getTitulo());
	System.out.println("G�nero de la pelicula: "+ p.getGenero());
	System.out.println("Director de la pelicula: "+ p.getDirector());
	System.out.println("Puntuaci�n de la pelicula: "+ p.getPuntuacion());
	}
}
	
