import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		ArrayList<String> listaStrings = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		do {
			System.out.println("Introduzca un nombre: (hasta Fin)");
			nombre = sc.nextLine();
			if (!nombre.equalsIgnoreCase("Fin")) {
				listaStrings.add(nombre);
			}
		} while (!nombre.equalsIgnoreCase("Fin"));
		for (String valor : listaStrings) {
			System.out.println(valor);
		}
		System.out.println("Fin del programa");
	}
}