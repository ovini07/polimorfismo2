package polimorfismo2;

public class Moto extends Brinquedo {

	public Moto(String cor, int velocidade, String nome) {
		super(cor, "Moto", velocidade, nome);
	}

	@Override
	public void mover() {
		System.out.println("A moto " + nome + " está acelerando a uma velocidade de " + velocidade + " km/h.");
	}
}
