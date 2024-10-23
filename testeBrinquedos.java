package polimorfismo2;

public class testeBrinquedos {

	public static void main(String[] args) {
		Brinquedo navio = new Navio("Azul", 30, "Navio Pirata");
		Brinquedo carro = new Carro("Vermelho", 120, "Ferrari");
		Brinquedo moto = new Moto("Preto", 150, "Harley Davidson");

		System.out.println("Movendo os brinquedos:");
		navio.mover();
		carro.mover();
		moto.mover();

		System.out.println("\nInformações dos brinquedos:");
		System.out.println("Navio: " + ((Navio) navio).getNome() + ", Cor: " + ((Navio) navio).getCor() + ", Velocidade: " + ((Navio) navio).getVelocidade() + " km/h");
		System.out.println("Carro: " + ((Carro) carro).getNome() + ", Cor: " + ((Carro) carro).getCor() + ", Velocidade: " + ((Carro) carro).getVelocidade() + " km/h");
	}
}