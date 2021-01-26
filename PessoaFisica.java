package Conta;

public class PessoaFisica {
	protected String cliente;
	protected double Saldo;
	
	public PessoaFisica() {
		System.out.println("--- Agencia 0127 ---");
		System.out.println("--- Seguro xx ----");
	}
	
	protected void ExibirSaldo() {
		System.out.printf("Saldo: R$%.2f\n", Saldo);
	}
	
	public void saque(double valor) {
		Saldo -= valor;
		System.out.printf("Saque: R$ %.2f\n", valor);
	}
	
	public void deposito(double valor) {
		Saldo += valor;
		System.out.printf("Deposito: R$ %.2f\n", valor);
	}
	public void tranferencia(PessoaFisica destino, double valor) {
		this.saque(valor);
		destino.deposito(valor);
		System.out.println("Tranferência: R$" + valor);
	}
}
