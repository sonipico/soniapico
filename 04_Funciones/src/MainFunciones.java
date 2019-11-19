import java.util.Scanner;

/*
 * Funciones o m�todos son cajas que no tenemos porqu� saber como 
 * hacen una funcionalidad(caja negra) pero s� como usarla.
 * Basicamente una funci�n tiene de 0 a N par�metro de entrada y de
 * 0 a 1 par�metros de salida.
 * Cuando usamos una funci�n tenemos que saber cuantos par�metro de 
 * entrada tiene y su tiene par�metros de salida.
 * Por ejemplo:
 * 	System.ou.println("hola");
 * 	La funci�n tiene 1 par�metrio de entrada y 0 de salida
 * 	int i = sc.nextInt();
 * 	La funci�n tiene 0 parametros de entrada 1 uno de salida.
 */
public class MainFunciones {
	/*
	 * Esta tambi�n es una funci�n, tiene un parametro de entrada que es un array de
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
	// las funciones se crean dentro de la clase,pero nunca dentro de otra funci�n.
	// por ejemplo
	// primero se pone la visibilidad, en este caso "public"
	// luego la palabra "static"
	// segundo el valor de retorno (si tuviera)
	// tercero se pone el nombre de la funci�n
	// cuarto se pone los par�metro de entrada en caso de tenerlos
	// los par�metros de entra va entre par�ntesis y si tiene varios vanseparados
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

	// una funci�n de lectura, pide un numero y lo devuelve
	public static int leerNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero");
		// el ciclo de vida de esta variable empieza en la siguiente linea
		// y muere cuando salga del bloque de la funci�n "{}"
		int numero = sc.nextInt();
		return numero;
	}
}
