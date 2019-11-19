import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero=0;
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		total=numero*numero;
		System.out.println("Mostrar el cuadrado de " +numero+ " es: "+total);
		sc.close();
	}

}
