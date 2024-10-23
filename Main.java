package polimorfismo2;
public class Main {
	public static void main(String[] args) {
		livro livro = new livro("Dom Quixote", "Miguel de Cervantes");

		biblioteca biblioteca = new biblioteca("Biblioteca Central", livro);

		biblioteca.exibirInfo();
	}
}
