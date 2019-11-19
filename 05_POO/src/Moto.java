
public class Moto {
	public String matricula;
	public String marca;
	public int posicion;
	public int velocidad;
	private int velocidadInicial;

	public Moto() {
		super();
	}

	public Moto(String matricula, String marca, int posicion, int velocidad) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.velocidadInicial = velocidad;
	}

	@Override
	public String toString() {
		return "La moto con matricula " + matricula + ", con marca " + marca + ", con  posicion " + posicion + " y  velocidad "
				+ velocidad + ".";
	}

	public int acelerar(boolean adelante) {
		if (adelante) {
			posicion = posicion + velocidad;
		}else {
			posicion= posicion-velocidad;
		}
		return posicion;
	}
	/*public int acelerarAtras() {
		posicion= posicion-velocidad;
		return posicion;
	}*/
	public void irAPosicionDeSalida() {
		this.posicion=0;
	}
	public void meterseEnBoxes() {
		this.velocidad=this.velocidadInicial;
	}
	public int getVelocidadInicial() {
		return this.velocidadInicial;
	}
}
