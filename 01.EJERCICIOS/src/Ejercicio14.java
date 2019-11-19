
public class Ejercicio14 {

	public static void main(String[] args) {
		Coche c = new Coche();
		c.matricula = "6475893pgmfy";
		c.marca = "Seat";
		c.modelo = "Panda";
		c.isNew = false;
		imprimirCoche(c);
		truefalse(c);

		Coche c1 = new Coche();
		c1.matricula = "782838238423";
		c1.marca = "citroen";
		c1.modelo = "corsa";
		c1.isNew = false;
		imprimirCoche(c1);
		truefalse(c1);

		Coche c2 = new Coche();
		c2.matricula = "7389392huhhb";
		c2.marca = "peugeot";
		c2.modelo = "207";
		c2.isNew = true;
		imprimirCoche(c2);
		truefalse(c2);
		
		Coche c3=new Coche("9839839839A3G2", "SEAT", "PANDA", true);
		imprimirCoche(c3);
		truefalse(c3);
		
		Coche c4= new Coche("CITROEN", "8378HNHF8");
		c4.modelo="839";
		imprimirCoche(c4);
		
		Coche c5=new Coche("HJWE8387");
		imprimirCoche(c5);
	}

	public static void imprimirCoche(Coche c1) {
		System.out.println("*****************************************");
		System.out.println("La matricula de su coche es: " + c1.matricula);
		System.out.println("La marca de su coche es: " + c1.marca);
		System.out.println("El modelo de su coche es:" + c1.modelo);
	}

	public static void truefalse(Coche c1) {
		if (c1.isNew == true) {
			System.out.println("Su coche es nuevo.");
		} else {
			System.out.println("Su coche es de segunda mano.");
		}
	}
}
