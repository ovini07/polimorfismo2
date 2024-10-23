package polimorfismo2;

public class biblioteca {
	private String nome;
	private livro livro;

	public biblioteca(String nome, livro livro) {
		this.nome = nome;
		this.livro = livro;
	}

	public void exibirInfo() {
		System.out.println("Biblioteca: " + nome);
		if (livro != null) {
			livro.exibirInfo();
		} else {
			System.out.println("Nenhum livro disponível.");
		}
	}
}
