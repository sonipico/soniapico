import java.util.ArrayList;

public class Ejercicio13 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("hola");
		lista.add("hola");
		lista.add("hola");		
		Array(lista);
		
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("adios");
		lista2.add("adios");
		lista2.add("adios");
		lista2.add("adios");		
		Array(lista2);
	}
	public static void Array(ArrayList<String> array) {
		for (String valor: array) {
			System.out.println(valor);
		}
	}
}
