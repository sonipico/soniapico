import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (i % 2 == 0) {
				System.out.println("El numero par de " + numero + " es: " + i);
			}
		}
		sc.close();
	}
}
