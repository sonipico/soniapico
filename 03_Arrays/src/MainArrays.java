import java.util.ArrayList;

public class MainArrays {

	public static void main(String[] args) {
		// Hay dos tipos de arrays: los estáticos y los dinámicos.
		// listas estática:

		int[] arrayNumeros = new int[10];
		arrayNumeros[0] = 23;
		arrayNumeros[4] = 56;
		System.out.println(arrayNumeros[0]);
		System.out.println(arrayNumeros[1]);
		System.out.println(arrayNumeros.length);

		// recorrer un array
		for (int i = 0; i <= arrayNumeros.length - 1; i++) {
			System.out.println("Valor de la posicion " + i + " del array es " + arrayNumeros[i]);
		}
		// si pones una posicion del array que no existe java te para el programa.
		System.out.println(arrayNumeros[4]);
		System.out.println("Esto se ejecutara después");

		// dinamicos:
		ArrayList<String> listaStrings = new ArrayList<String>();//como crear un array dinámico
		listaStrings.add(0, "Harry");// primer valor, posicion, segundo valor el valor
		System.out.println(listaStrings.get(0));
		// set es para remplazar un nombre por otro
		listaStrings.add(1, "Hermione");
		listaStrings.add("Ron");
		listaStrings.set(0, "Laura");
		System.out.println(listaStrings.get(0));
		System.out.println(listaStrings.get(1));
		System.out.println(listaStrings.get(2));

		for (int i = 0; i < listaStrings.size(); i++) {
			System.out.println(listaStrings.get(i));
		}
		//manera correcta de recorrerse un array tanto estático como dinámico es un for each
		
		for(String valor: listaStrings) {
			System.out.println(valor);
		}
	}

}
