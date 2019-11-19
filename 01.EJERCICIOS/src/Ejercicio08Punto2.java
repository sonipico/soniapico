
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08Punto2 {

	public static void main(String[] args) {
		ArrayList<String> nombresPedidos = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce Nombre");
			String nombre = sc.nextLine();
			nombresPedidos.add(nombre);
		}
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