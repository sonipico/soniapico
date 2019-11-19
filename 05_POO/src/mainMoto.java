
public class mainMoto {

	public static void main(String[] args) {
		Moto moto=new Moto("1234", "YAMAHA", 0, 20);
		int posicion=moto.acelerar(true);
		moto.acelerar(true);
		moto.acelerar(true);
		moto.acelerar(false);
		System.out.println(posicion);
		System.out.println(moto);
		
		Moto moto2 =new Moto("2345", "BMW", 0, 25);
		moto2.acelerar(true);
		moto2.acelerar(true);
		moto2.acelerar(true);
		moto2.velocidad=10;
		moto2.acelerar(true);
		moto2.acelerar(true);
		moto2.meterseEnBoxes();
		moto2.acelerar(true);
		moto2.acelerar(true);
		System.out.println(moto2.getVelocidadInicial());
		System.out.println(moto2);
		
	}

}
