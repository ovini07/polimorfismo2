package polimorfismo2;

public class livro {
	    private String titulo;
	    private String autor;

	    public livro(String titulo, String autor) {
	        this.titulo = titulo;
	        this.autor = autor;
	    }
	    public String getTitulo() {
	        return titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }
	    public void exibirInfo() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	    }
	}

