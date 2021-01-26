package Seguros;

import java.util.Random;

public class SeguroPessoaFisica{
	public String situaçãoSeguro;
	
	public SeguroPessoaFisica() {
	Random gerador = new Random();
	int seguroGerador = gerador.nextInt(1000);	
	System.out.printf("--- Seguro: %d ---\n", seguroGerador);
	}
	public void statusSeguro() {
		
		System.out.println("Status seguro: Ativo");
	}
	
}
