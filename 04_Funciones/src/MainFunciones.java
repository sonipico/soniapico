import java.util.Scanner;

/*
 * Funciones o métodos son cajas que no tenemos porqué saber como 
 * hacen una funcionalidad(caja negra) pero sí como usarla.
 * Basicamente una función tiene de 0 a N parámetro de entrada y de
 * 0 a 1 parámetros de salida.
 * Cuando usamos una función tenemos que saber cuantos parámetro de 
 * entrada tiene y su tiene parámetros de salida.
 * Por ejemplo:
 * 	System.ou.println("hola");
 * 	La función tiene 1 parámetrio de entrada y 0 de salida
 * 	int i = sc.nextInt();
 * 	La función tiene 0 parametros de entrada 1 uno de salida.
 */
public class MainFunciones {
	/*
	 * Esta también es una función, tiene un parametro de entrada que es un array de
	 * String y no tiene parametros de salida (porque pone void)
	 */
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		mostrarMenu();
		imprimirNombre("Felix");
		imprimirNombre("Laura");
		imprimirNombreApellidos("Laura", " Picorel");
		System.out.println(leerNumero());
		int n1 = leerNumero();
		int n2 = leerNumero();
		int resultado = n1 + n2;
		System.out.println("El resultado es: " + resultado);
		System.out.println("Fin del programa");
	}
	// podemos crear todas las funciones que queramos
	// las funciones se crean dentro de la clase,pero nunca dentro de otra función.
	// por ejemplo
	// primero se pone la visibilidad, en este caso "public"
	// luego la palabra "static"
	// segundo el valor de retorno (si tuviera)
	// tercero se pone el nombre de la función
	// cuarto se pone los parámetro de entrada en caso de tenerlos
	// los parámetros de entra va entre paréntesis y si tiene varios vanseparados
	// por ";".

	public static void mostrarMenu() {
		System.out.println("1-Crear Persona");
		System.out.println("2-Borrar Persona");
		System.out.println("3-Modificar Persona");
		System.out.println("4-Buscar Persona");
		System.out.println("0-Salir del programa");
	}

	// imprimir un nombre por pantalla de manera bonita
	public static void imprimirNombre(String nombre) {
		System.out.println("************************");
		System.out.println(nombre);
		System.out.println("************************");

	}

	public static void imprimirNombreApellidos(String nombre, String apellidos) {
		System.out.println("************************");
		System.out.println(nombre + apellidos);
		System.out.println("************************");

	}

	// una función de lectura, pide un numero y lo devuelve
	public static int leerNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		// el ciclo de vida de esta variable empieza en la siguiente linea
		// y muere cuando salga del bloque de la función "{}"
		int numero = sc.nextInt();
		return numero;
	}
}
