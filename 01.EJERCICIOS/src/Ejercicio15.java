import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int cont = 0;
		boolean isNew = true;
		Scanner sc = new Scanner(System.in);
		ArrayList<Coche> coches = new ArrayList<Coche>();
		System.out.println("REGISTRO DE COCHES");
		System.out.println("Buenos días, bienvenido al registro de coche.");
		do {
			System.out.println("Introduzca su coche");
			String matricula = leerDato("matricula:");
			String marca = leerDato("marca:");
			String modelo = leerDato("modelo:");
			System.out.println("Introduzca si es nuevo o no con true o false: ");
			isNew = sc.nextBoolean();
			Coche c = new Coche(matricula, marca, modelo, isNew);
			coches.add(c);
			cont++;
			sc.nextLine();
		} while (cont < 3);
		recorrerArray(coches);
		System.out.println("Gracias por utilizar el registro de coches.");
	}

	public static String leerDato(String cadena) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su " + cadena);
		String dato = sc.nextLine();
		return dato;
	}

	public static void recorrerArray(ArrayList<Coche> coches) {
		for (Coche valor : coches) {
			System.out.println("Su marca de coche es " + valor.marca + " ,con matricula " + valor.matricula
					+ " ,modelo " + valor.modelo + ".");
			if (valor.isNew == true) {
				System.out.println("Su coche es nuevo.");
			} else {
				System.out.println("Su coche es de segunda mano.");
			}
		}
	}
}
