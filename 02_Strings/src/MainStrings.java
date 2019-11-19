
public class MainStrings {

	public static void main(String[] args) {
		// Las cadenas en java no son primitivos
		// son objetos
		String cadena = "Harry Potter";
		String cadena2 = "Hermione";
		String cadena3 = "Ron WeasleY";

		String valor = "Homero";
		String valor2 = "Homero";

		// para comparar strings siempre el metodo equals
		if (valor.equals(valor2)) {
			System.out.println("Los nombres son iguales");
		}
		String valor3 = "homero";
		if (valor.equals(valor3)) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres no son iguales");
			
		} // compara strings sin importale las mayúsculas, ignorando información
		if (valor.equalsIgnoreCase(valor3)) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres no son iguales");
			
		} // para ver si contiene una palabra la frase
		String frase = "Hommero se comió un pollo";
		if (frase.contains("Hommero")) {
			System.out.println("Si existe Hommero");
		} else {
			System.out.println("no esciste Hommero");

		} // para hacer la frase en mayusculas
		String mayusculas = frase.toUpperCase();
		System.out.println(mayusculas);

		// pregunta si una frase termina con una palabra, responde true o false
		System.out.println(frase.endsWith("pollo"));

		// esto te da los numero de posiones desde el primer numero que pones hasta el
		// ultimo que pones(0,0), se incluyen los espacios.
		String subcadena = frase.substring(0, 7);
		System.out.println(subcadena);
		
		//para ver los caracteres que tiene una frase
		System.out.println(frase.length());
	}

}
