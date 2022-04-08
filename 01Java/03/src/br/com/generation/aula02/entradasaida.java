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
	
	System.out.println("a soma de a e b é: " + soma);
	System.out.println("a subtração de a e b é: " + sub);
	System.out.println("a divisão de a e b é: " + div);
	System.out.println("a multiplicação de a e b é: " + mult);
	
	leia .close();
	
	

	}

}
