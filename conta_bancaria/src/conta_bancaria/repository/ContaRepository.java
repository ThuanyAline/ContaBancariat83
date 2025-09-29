package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {

	// MÉTODOS CRUD
	
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void procurarPorNumero (int numero);
	public void deletar(int numero);
	public void listarPorTitular(String titular);

	
	// metodos bancarios
	
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir (int numeroOrigem, int numeroDestino, float valor);

	
	
}
