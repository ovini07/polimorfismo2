package polimorfismo2;

public class Processador {
		private String marca;
		private String frequencia;

		public Processador(String marca, String frequencia) {
			this.marca = marca;
			this.frequencia = frequencia;
		}

		public String getMarca() {
			return marca;
		}

		public String getFrequencia() {
			return frequencia;
		}

		public void exibirInfoProcessador() {
			System.out.println("Marca do Processador: " + marca);
			System.out.println("Frequência do Processador: " + frequencia);
		}
	}

