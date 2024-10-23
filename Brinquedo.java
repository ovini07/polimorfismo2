package polimorfismo2;

public class Brinquedo {

	protected String cor;
	protected String tipo;
	protected int velocidade;
	protected String nome;
	public Brinquedo(String cor, String tipo, int velocidade, String nome) {
		this.cor = cor;
		this.tipo = tipo;
		this.velocidade = velocidade;
		this.nome = nome;
	}
	public void mover() {
		System.out.println("O brinquedo está se movendo.");
	}
}
