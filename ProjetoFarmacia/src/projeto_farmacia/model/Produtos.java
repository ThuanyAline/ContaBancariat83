package projeto_farmacia.model;

public abstract class Produtos {

	// atributos da Farmacia
	
	private String nome;
	private int    categoria;
	private String descricao;
	private float  preco;
	private int    id;
	
	public Produtos(String nome, int categoria, String descrição, float preco, int id) {
		this.nome = nome;
		this.categoria = categoria;
		this.descricao = descrição;
		this.preco = preco;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getDescrição() {
		return descricao;
	}

	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 public void visualizar() {
		 
	 }
	
}


