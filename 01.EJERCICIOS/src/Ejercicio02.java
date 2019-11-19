import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int numeroIntroducido = 0;
		do {
			int nMayor = 0;
			do {
				System.out.println("Introduzca un numero: ");
				numero = sc.nextInt();
				if (numero > nMayor) {
					nMayor = numero;
				}
				System.out.println("El número mayor es:" + nMayor);
			} while (numero > 0);
			System.out.println("¿Desea introducir otra secuencia de numeros?(0.Si 1.No)");
			numeroIntroducido = sc.nextInt();
		} while (numeroIntroducido == 0);
		System.out.println("Fin del programa");
		sc.close();
	}
}
