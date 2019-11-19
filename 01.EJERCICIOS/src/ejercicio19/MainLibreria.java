package ejercicio19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libreria libreria = new Libreria();
		libreria.setListaLibros(new ArrayList<Libro>());
		int opcion = 0;
		System.out.println("Buenos días, bienvenido a la Librería.");
		do {
			menu();
			opcion = leernumero(sc);
			if (opcion == 1) {
				System.out.println("Ha escogido introducir un libro nuevo.");
				System.out.println("Introduzca el libro.");
				String titulo = leerDatos("titulo: ", sc);
				String ISBN = leerDatos("ISBN: ", sc);
				String Editorial = leerDatos("Editorial: ", sc);
				Autor autor = leerDatosAutor("Autor", sc);
				Libro libro1 = new Libro();
				libro1.setTitulo(titulo);
				libro1.setISBN(ISBN);
				libro1.setEditorial(Editorial);
				libro1.setAutor(autor);
				libreria.getListaLibros().add(libro1);
			} else if (opcion == 2) {
				System.out.println("Ha escogido mostrar el listado de libros.");
				System.out.println(libreria.getListaLibros());

			} else if (opcion == 3) {
				System.out.println("Ha escogido buscar un libro.");
				menuBuscar();
				opcion = leernumero(sc);
				if (opcion == 1) {
					System.out.println("Introduzca el ISBN que quieras buscar.");
					String ISBN = leerDatos("ISBN:", sc);
					System.out.println(libreria.mostrarlbro(ISBN));
				} else if (opcion == 2) {
					System.out.println("Introduzca el titulo que quieras buscar.");
					String titulo = leerDatos("Titulo:", sc);
					ArrayList<Libro>listaLibrosTitulo=libreria.mostrarLibro(titulo);
					System.out.println(listaLibrosTitulo);
				} else if (opcion == 3) {
					System.out.println("Introduzca la editorial que quieras buscar.");
					String editorial = leerDatos("Editorial:", sc);
					ArrayList<Libro>listaLibrosEditorial=libreria.mostrarLibroEditotial(editorial);
					System.out.println(listaLibrosEditorial);
				}else if (opcion == 4) {
					System.out.println("Introduzca el nombre del autor que quieras buscar.");
					String nombre = leerDatos("Editorial:", sc);
					ArrayList<Libro>listaLibrosAutores=libreria.mostrarLibroAutor(nombre);
					System.out.println(listaLibrosAutores);
				}
			}
		} while (opcion != 0);
		System.out.println("Ha escogido salir del programa.");
		System.out.println("Gracias por utilizarlo.");
	}

	public static void menu() {
		System.out.println("MENU");
		System.out.println("1-Alta Libros.");
		System.out.println("2-Listado de libros.");
		System.out.println("3-Buscar un libro.");
		System.out.println("0-Salir del programa.");
		System.out.println();
	}

	public static int leernumero(Scanner sc) {
		System.out.println("Introduzca un numero: ");
		int opcion1=-1;
		try {
			String opcion = sc.nextLine();
			opcion1 = Integer.parseInt(opcion);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Solo se admiten numeros");
		}
		return opcion1;
	}

	public static String leerDatos(String cadena, Scanner sc) {
		System.out.println("Introduzca " + cadena);
		String dato = sc.nextLine();
		return dato;
	}

	public static Autor leerDatosAutor(String cadena, Scanner sc) {
		System.out.println("Introduzca " + cadena);
		Autor autor1 = new Autor();
		System.out.println("Introduzca nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduzca apellidos: ");
		String apellidos = sc.nextLine();
		System.out.println("Introduzca fecha de nacimiento: ");
		String fechaNacimiento = sc.nextLine();
		autor1.setNombre(nombre);
		autor1.setApellidos(apellidos);
		autor1.setFechaNacimiento(fechaNacimiento);
		return autor1;
	}

	public static void menuBuscar() {
		System.out.println("Puede elegir buscar libro de diferentes maneras.");
		System.out.println("1-ISBN");
		System.out.println("2-Titulo");
		System.out.println("3-Editorial");
		System.out.println("4-Nombre de autor");
		System.out.println();
	}
	
}
