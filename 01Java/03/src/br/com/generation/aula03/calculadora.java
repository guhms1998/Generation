package br.com.generation.aula03;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o 1o Numero");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite o 2o Numero");
		numero2 = entrada.nextDouble();
		
		System.out.println("Defina a operação");
		operacao = entrada.next().charAt(0);
		
		if(operacao == '-') {
			resultado = numero1 - numero2;
		}
		else if (operacao == '+') {
			resultado = numero1 + numero2;
		}
		else if (operacao == '*') {
			resultado = numero1 * numero2;
		}
		else if (operacao == '/') {
			resultado = numero1 / numero2;					
		}
		else {
			System.out.println("opção invalida");
		}
		
		System.out.printf("resultado " , resultado);
		entrada.close();
		
					
		
		
		
	}

}
