package br.com.generation.aula02;

import java.util.Scanner;

public class entradasaida {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);//Cntrl + shift + O
	
	double soma, div, mult, sub, a, b;
	
	
	System.out.println("digite a ");
	a = leia.nextDouble();
	System.out.println("digite b ");
	b = leia.nextDouble();
	
	soma = a + b;
	sub = a - b;
	div = a / b;
	mult = a * b;
	
	System.out.println("a soma de a e b �: " + soma);
	System.out.println("a subtra��o de a e b �: " + sub);
	System.out.println("a divis�o de a e b �: " + div);
	System.out.println("a multiplica��o de a e b �: " + mult);
	
	leia .close();
	
	

	}

}
