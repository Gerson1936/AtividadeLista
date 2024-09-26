package aplicacoes;

public class Pedido {
	private String nomePrato;
	private int quantidade;

	public Pedido(String nomePrato, int quantidade) {
	        this.nomePrato = nomePrato;
	        this.quantidade = quantidade;
	    }

	public String getNomePrato() {
		return nomePrato;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Prato: " + nomePrato + ", Quantidade: " + quantidade;
	}

	}

	