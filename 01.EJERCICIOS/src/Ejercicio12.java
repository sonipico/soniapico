import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		double total = 0;
		double numero1 = 0;
		double numero2 = 0;
		ArrayList<Double> numerosGuardados = new ArrayList<Double>();
		ArrayList<String> fraseDeResultados = new ArrayList<String>();
		int opcion = 0;
		do {
			opcion = mostrarIndice();
			if (opcion == 1) {
				System.out.println("Ha elegido la opción sumar");
				numero1 = leerNumero();
				numero2 = leerNumero();
				total = sumar(numero1, numero2);
				System.out.println("El resultado de la suma es: " + total);
				System.out.println();
				String frase = "La Suma de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			} else if (opcion == 2) {
				System.out.println("Ha elegido la opción restar");
				numero1 = leerNumero();
				numero2 = leerNumero();
				total = restar(numero1, numero2);
				System.out.println("El resultado de la resta es: " + total);
				System.out.println();
				String frase = "La resta de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			} else if (opcion == 3) {
				System.out.println("Ha elegido la opción Multiplicar");
				numero1 = leerNumero();
				numero2 = leerNumero();
				total = multiplicar(numero1, numero2);
				System.out.println("El resultado de la multiplicación es: " + total);
				System.out.println();
				String frase = "La Multiplicación de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			} else if (opcion == 4) {
				System.out.println("Ha elegido la opción Dividir");
				numero1 = leerNumero();
				numero2 = leerNumero();
				total = dividir(numero1, numero2);
				System.out.println("El resultado de la división es: " + total);
				System.out.println();
				String frase = "La división de " + numero1 + " y " + numero2 + " es " + total;
				fraseDeResultados.add(frase);
				numerosGuardados.add(total);
			}
		} while (opcion != 0);
		System.out.println("Ha elegido la opción salir");
		System.out.println("Estos son los resultados guardados: ");
		Array2(numerosGuardados);
		Array(fraseDeResultados);
		
		System.out.println("Gracias por elegir este programa, adiós.");
	}
	public static void Array(ArrayList<String> array) {
		for (String valor: array) {
			System.out.println(valor);
		}
	}
	
	public static void Array2(ArrayList<Double> array) {
		for (Double valor: array) {
			System.out.println(valor);
		}
	}
	
	public static int mostrarIndice() {
		System.out.println("Elija una opción:");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("0-Salir");
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}

	public static double leerNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		double numero = sc.nextDouble();
		return numero;
	}

	public static double sumar(double n1, double n2) {
		return n1 + n2;
	}

	public static double restar(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public static double dividir(double n1, double n2) {
		return n1 / n2;
	}

}
