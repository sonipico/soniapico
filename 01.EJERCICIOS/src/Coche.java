
public class Coche {
	public String matricula;
	public String marca;
	public String modelo;
	public boolean isNew;
	
	public Coche(){
		this.marca="";
	}

	public Coche(String matricula, String marca, String modelo, boolean isNew) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.isNew = isNew;
	}
	public Coche(String matricula1) {
		this();//esto llama al constructor sin parámetros.
		matricula=matricula1;
	}
	public Coche(String marca1,String matricula1) {
		marca=marca1;
		matricula=matricula1;
	}
}
	