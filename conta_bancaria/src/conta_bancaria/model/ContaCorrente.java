package conta_bancaria.model;

// extends significa estender algo no caso estender a conta para uma conta corrente HERENÇA
public class ContaCorrente extends Conta{
	
	private Float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		// SUPER RESPONSÁVEL POR GERAR ESSE TIPO DE CONTA ASSIM CONSTRUINDO A LIGAÇÃO DAS CONTAS 
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite() < valor) {
		System.out.println("\nSaldo Insuficiente!");
		return false;
		
		}
		 this.setSaldo(this.getSaldo() - valor);
		 return true;
	}
	// CRIADO P VIZUALIZAR NO MENU A AOPÇÃO DO LIMITE (polimorfismo)
	@Override // indicador de que estou reencrevendo esse método da SUPER CLASSE - BOAS PRÁTICAS
    public void visualizar() {
    	super.visualizar();
    	System.out.printf("Limite da Conta: R$ %.2f%n", this.limite);
    }
   
}
