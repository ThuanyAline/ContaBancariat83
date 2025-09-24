package conta_bancaria.model;

public class ContaPoupanca extends Conta{

	private float aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, float aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public float getAniversario() {
		return aniversario;
	}

	public void setAniversario(float aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
    public boolean sacar(float valor) {
		if(this.getSaldo() + this.getSaldo() < valor) {
		System.out.println("\nSaldo insuficiente!");
		return false;
		}
		 this.setSaldo(this.getSaldo() - valor);
		 return true;
		}
		 
    @Override // reenscrivi o metodo
	public void visualizar() {
	   super.visualizar();
   	System.out.printf("Aniversário da Conta: %.2f%n", this.aniversario);
}

	
}