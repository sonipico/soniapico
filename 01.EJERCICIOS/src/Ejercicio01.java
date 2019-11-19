import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido = 0;
		do {
			int numero = 0;
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			for (int i = 1; i <= numero; i++) {
				System.out.println("El numero es " + i);
			}
			do {
				System.out.println("¿Quiere introducir otro numero? (0.Si 1.No)");
				numeroIntroducido = sc.nextInt();
			}while(numeroIntroducido < 0 || numeroIntroducido> 1);
		} while (numeroIntroducido == 0);
		System.out.println("Fin del programa");
		sc.close();
	}
}
