import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		long numero = 0;
		long total = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		for (int i = 2; i <= numero; i++) {
			total = total * i;
		}
		System.out.println("El factorial de " + numero + " es: " + total);
		sc.close();
	}
}
