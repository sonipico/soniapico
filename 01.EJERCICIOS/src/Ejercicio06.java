import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int numero1 = 0;
		int numero2 = 0;
		int total = 0;
		do {
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("0-Salir");
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			if (numero == 1) {
				System.out.println("Ha elegido la opci�n sumar");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextInt();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextInt();
				total = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + total);
				System.out.println();
			} else if (numero == 2) {
				System.out.println("Ha elegido la opci�n restar");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextInt();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextInt();
				total = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + total);
				System.out.println();
			} else if (numero == 3) {
				System.out.println("Ha elegido la opci�n Multiplicar");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextInt();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextInt();
				total = numero1 * numero2;
				System.out.println("El resultado de la multiplicaci�n es: " + total);
				System.out.println();
			} else if (numero == 4) {
				System.out.println("Ha elegido la opci�n Dividir");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextInt();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextInt();
				total = numero1 / numero2;
				System.out.println("El resultado de la divisi�n es: " + total);
				System.out.println();
			}
		} while (numero != 0);
		System.out.println("Ha elegido la opci�n salir");
		System.out.println("Gracias por elegir este programa, adi�s.");

	}

}
