
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		ArrayList<String> nombresPedidos = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		do {
			System.out.println("Introduzca un nombre:");
			nombre = sc.nextLine();
			if (!nombre.equalsIgnoreCase("Fin")) {
				nombresPedidos.add(nombre);
			}
		} while (!nombre.equalsIgnoreCase("Fin"));
		for (String valor : nombresPedidos) {
			String mayusculas = valor.toUpperCase();
			System.out.println(mayusculas);
		}
		for (String valor : nombresPedidos) {
			String minusculas = valor.toLowerCase();
			System.out.println(minusculas);
		}
		System.out.println("Fin del programa");
	}
}