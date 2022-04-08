package br.com.genration.sobrecarga;

public class MinhaCalculadora {
	
	public int soma(int numero1, int numero2) {
		System.out.println("soma de inteiros");
		return numero1 + numero2;
		
	}
	
	public double soma(double numero1, double numero2) {
		System.out.println("soma fracionada");
		return numero1 + numero2;
	}
}