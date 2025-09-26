package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {

	// MÉTODOS CRUD
	
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void procurarPorNumero (int numero);
	public void deletar(int numero);
	
	// metodos bancarios
	
	public void sacar(int numero, float valor);
	public void depositar(int nuemro, float valor);
	public void transferrir (int numeroOrigem, int numeroDestino, float valor);
	
	
}
