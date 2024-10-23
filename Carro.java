package polimorfismo2;

public class Carro extends Brinquedo {

	public Carro(String cor, int velocidade, String nome) {
		super(cor, "Carro", velocidade, nome);
	}

	@Override
	public void mover() {
		System.out.println("O carro " + nome + " está andando a uma velocidade de " + velocidade + " km/h.");
	}
}
