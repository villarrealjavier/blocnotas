package Herencia_implementacion;

public class Leon extends Animal implements Sonido, Accion{

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Estoy comiendo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Estoy durmiendo");
	}

	@Override
	public String emitirSonido() {
		// TODO Auto-generated method stub
		return "grrrrrrrrr";
	}

	@Override
	public void accionCorrer() {
		// TODO Auto-generated method stub
		System.out.println("Estoy corriendo");
	}

	@Override
	public void accionTrotar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy trotando");
	}
	

}
