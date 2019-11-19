
public class Variables {

	public static void main(String[] args) {
		int numero = 0;//para guardar variables numéricas
		System.out.println( "El número es:"+ numero);
		int numero2 = 2;
		System.out.println("El número es:"+numero2);
		
//		otros tipos de variables
		//en java tenemos dos tipo de variables
				//variables primitivas/variables de refrerecnia
				//variables primitivas:int, long, double, boolean
		long numeroLargo=676;
		System.out.println("El número largo es:"+numeroLargo);
		double numeroReal=34.567;
		boolean cierto=true;
		cierto=false;
		System.out.println(cierto);
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		
		//el otro tipo son las variables de referencia o directamnete referencias:
		String nombre="pepe";
		System.out.println("El nombre es:"+nombre);
		nombre="laura";
		System.out.println("El nombre es:"+nombre);
		//es buena costumbre inicializar las variables
		double numero4 = 10;
		double numero5 = numero4;
		System.out.println("El número es:"+numero5);
		
		int numero6=56;
		double numero7 = numero6;
		System.out.println("El número es:"+numero7);
		//en una caja de double puede meter cualquier contenido que quepa en una caja de int
		
		//double numero8=56;
		//int numero9 = numero8;
		//esto no se podría hacer porque en una caja pequeña int no puedes meter una caja double
		
		double numero10=56;
		int numero11 = (int)numero10;
		System.out.println("El número es:"+numero11);
		//así lo intetamos meter	
	}

}
