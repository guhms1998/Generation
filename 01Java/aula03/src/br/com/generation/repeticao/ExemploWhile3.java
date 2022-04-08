package br.com.generation.repeticao;

import java.util.Scanner;

public class ExemploWhile3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = -1;
		
		while(numero != 10) { 
			System.out.println("digite um numero : ");
			numero = entrada.nextInt();
			
			if (numero == 10) {
				System.out.println("acertou!!");
			}
			else {
				System.out.println("errou!!");
			}
			
			
		}
		entrada.close();		
	}

}
