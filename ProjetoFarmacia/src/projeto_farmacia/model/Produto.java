package projeto_farmacia.model;

public class Produto {
	// ATRIBUTOS DA CLASSE

	private String produtos;
	private String remedios;
	private String receitas;

	// O METODO CONTRUTOR TEM O MESMO NOME DA CLASSE E O EMSMO NÚMERO DE ATRIBUTOS

	public ProdutosFarmacia(String produtos, String remedios, String receitas) {
		this.produtos = produtos;
		this.remedios = remedios;
		this.receitas = receitas;

	}
	// METODOS GET E SET GET = PEGA O VALOR GUARDADO DE UM ATIBUTO E METODO SET =
	// ALTERA O VALOR GUARDADO EM UM ATRIBUTO

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getRemedios() {
		return remedios;
	}

	public void setRemedios(String remedios) {
		this.remedios = remedios;
	}

	public String getReceitas() {
		return receitas;
	}

	public void setReceitas(String receitas) {
		this.receitas = receitas;
	}

}

