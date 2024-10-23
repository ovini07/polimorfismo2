package polimorfismo2;

public class Navio extends Brinquedo{
	public Navio(String cor, int velocidade, String nome) {
		super(cor, "Navio", velocidade, nome);
	}

	@Override
	public void mover() {
		System.out.println("O navio " + nome + " está navegando a uma velocidade de " + velocidade + " km/h.");
	}
}
