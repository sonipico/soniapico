
/*
 * Las clases en java son moldes para la creación de objetos,
 * son planos en los que java se va a basar la creación de los objetos
 */
public class Persona {
	/*
	 * una clase en java (en cualquier lenguaje) tiene atributos y tiene 
	 * metodos
	 * Los atributos en java se suelen poner dentro d la clase y al 
	 * prinicpio de ella
	 */
	public String nombre;
	public double peso;
	public int edad;
	
	/*este es el constructor por defecto
	 * se llaman igual que la clase
	 * pero podemos tener todos los constructores que queramos
	 */
	public Persona() {
		
	}
	/*public Persona(String nombre1, double peso1, int edad1) {
		nombre=nombre1;
		peso= peso1;
		edad=edad1;
	}*/
	public Persona(String nombre, double peso, int edad) {
		super();//en java existe la herencia y esto esta invocando al padre de este objeto
		this.nombre = nombre;//this es una referencia al propio objeto
		this.peso = peso;
		this.edad = edad;
	}
}
