import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10Punto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		double numero1 = 0;
		double numero2 = 0;
		double total = 0;
		ArrayList<Double> numerosGuardados = new ArrayList<Double>();
		ArrayList<String> fraseDeResultados = new ArrayList<String>();
		do {
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("0-Salir");
			System.out.println("Introduzca un numero: ");
			numero = sc.nextInt();
			if (numero == 1) {
				System.out.println("Ha elegido la opción sumar");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextDouble();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextDouble();
				total = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + total);
				System.out.println();
				String frase = "La Suma de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			} else if (numero == 2) {
				System.out.println("Ha elegido la opción restar");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextDouble();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextDouble();
				total = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + total);
				System.out.println();
				String frase = "La resta de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			} else if (numero == 3) {
				System.out.println("Ha elegido la opción Multiplicar");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextDouble();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextDouble();
				total = numero1 * numero2;
				System.out.println("El resultado de la multiplicación es: " + total);
				System.out.println();
				String frase = "La Multiplicación de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			} else if (numero == 4) {
				System.out.println("Ha elegido la opción Dividir");
				System.out.println("Introduzca un numero: ");
				numero1 = sc.nextDouble();
				System.out.println("Introduzca un numero: ");
				numero2 = sc.nextDouble();
				total = numero1 / numero2;
				System.out.println("El resultado de la división es: " + total);
				System.out.println();
				String frase = "La división de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			}
		} while (numero != 0);
		System.out.println("Ha elegido la opción salir");
		System.out.println("Estos son los resultados guardados: ");
		for (double n : numerosGuardados) {
			System.out.println(n);
		}
		for (String valor : fraseDeResultados) {
			System.out.println(valor);
		}
		System.out.println("Gracias por elegir este programa, adiós.");
	}

}