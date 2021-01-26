package Conta;

import Seguros.SeguroPessoaFisica;

public class Conta {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica(); 
		
		
		pf1.cliente = "Rodrigo Souza";
		pf1.Saldo = 10000;
		
		System.out.println("Nome: " + pf1.cliente);
		pf1.ExibirSaldo();
		pf1.deposito(1500);
		pf1.ExibirSaldo();
		pf1.saque(200);
		pf1.ExibirSaldo();
		System.out.println();
		
		PessoaFisica pf2 = new PessoaFisica();
		pf2.cliente = "Rosana Lima";
		pf2.Saldo = 20000;
		
		System.out.println("Nome: " + pf2.cliente);
		pf2.ExibirSaldo();
		pf2.deposito(1000);
		pf2.ExibirSaldo();
		pf2.saque(350);
		pf2.ExibirSaldo();
		System.out.println();
		
		System.out.println("Nome: " + pf2.cliente);
		pf2.ExibirSaldo();
		pf1.tranferencia(pf2, 1000);
		pf2.ExibirSaldo();
		
		System.out.println();
		SeguroPessoaFisica spf = new SeguroPessoaFisica();
		spf.situaçãoSeguro = "Processando...";
		System.out.println("Situação Seguro: " + spf.situaçãoSeguro);
		spf.statusSeguro();
		
		
		
	}

}
