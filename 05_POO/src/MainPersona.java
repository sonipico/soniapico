
public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Bartolo";
		p1.edad = 25;
		p1.peso = 65.5;
		
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.peso);
		System.out.println(p1);
		
		Persona p2=new Persona();
		p2.nombre= "Bud Spencer";
		p2.edad = 78;
		p2.peso = 119;
		
		System.out.println(p2.nombre);
		System.out.println(p2.edad);
		System.out.println(p2.peso);
		System.out.println(p2);
		
		Persona p3=p2;
		p3.edad =55;
		/*
		 * Cambias el valor de edad de p2 por el que metes en p3.
		 */
		System.out.println(p2.edad);
		System.out.println(p3.edad);
		p1=p2;
		p1.edad=77;
		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.peso);
		System.out.println(p1);
		System.out.println(p2.nombre);
		System.out.println(p2.edad);
		System.out.println(p2.peso);
		System.out.println(p2);
		System.out.println(p3);
		Persona p4= new Persona("Eloy", 78, 29);
		System.out.println(p4.nombre);
		System.out.println(p4.edad);
		System.out.println(p4.peso);
		
	}

}
