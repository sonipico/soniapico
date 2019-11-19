import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		ArrayList<String> nombresPedidos = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String nombre = "";
		do {
			System.out.println("Introduzca un nombre:");
			nombre = sc.nextLine();
			nombresPedidos.add(nombre);
			i++;
		} while (i < 10);
		for (String valor : nombresPedidos) {
			String mayusculas = valor.toUpperCase();
			System.out.println(mayusculas);
		}
		for (String valor : nombresPedidos) {
			String minusculas = valor.toLowerCase();
			System.out.println(minusculas);
		}

	}
}
