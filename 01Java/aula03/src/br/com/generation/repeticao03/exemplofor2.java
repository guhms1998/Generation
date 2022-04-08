package br.com.generation.repeticao03;

public class exemplofor2 {

	public static void main(String[] args) {
		int n = 10;
		int i, soma;
		
		for(i=0, soma = 0; i <= n; i++) {
			System.out.println("soma = " + soma + "+" + i);
			soma = soma + i;
			System.out.println(" = " + soma);
		}
	}

}
