import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		imprimirUsuariosmayuscula("lucia", " perez", 19, " 678987564");
		imprimirUsuariosmayuscula("pepa", " lopez", 54, " 679050534");
		imprimirUsuariosmayuscula("laura", " rodriguez", 35, " 670345756");
		imprimirUsuariosminusculas("laura", " rodriguez", 35, " 670345756");
		imprimirUsuariosminusculas("lucia", " perez", 19, " 678987564");
		imprimirUsuariosminusculas("pepa", " lopez", 54, " 679050534");
		imprimirUsuario("lucia", " perez", 19, " 678987564", true);
		imprimirUsuario("lucia", " perez", 19, " 678987564", false);
		imprimirUsuario("pepa", " lopez", 54, " 679050534",true);
		imprimirUsuario("pepa", " lopez", 54, " 679050534",false);
		imprimirUsuario("laura", " rodriguez", 35, " 670345756",true);
		imprimirUsuario("laura", " rodriguez", 35, " 670345756",false);

	}

	public static void imprimirUsuariosmayuscula(String nombre, String apellido, int edad, String telefono) {
		System.out.println("************************");
		System.out.println(nombre.toUpperCase() + apellido.toUpperCase());
		System.out.println("La edad es " + edad);
		System.out.println("El número de teléfono es" + telefono);
		System.out.println("************************");

	}

	public static void imprimirUsuariosminusculas(String nombre, String apellido, int edad, String telefono) {
		System.out.println("************************");
		System.out.println(nombre.toLowerCase() + apellido.toLowerCase());
		System.out.println("La edad es " + edad);
		System.out.println("El número de teléfono es" + telefono);
		System.out.println("************************");

	}

	public static void imprimirUsuario(String nombre, String apellido, int edad, String telefono, boolean mayuscula) {
		if (mayuscula) {
			imprimirUsuariosmayuscula(nombre, apellido, edad, telefono);
		} else {
			imprimirUsuariosminusculas(nombre, apellido, edad, telefono);
		}
	}

}
