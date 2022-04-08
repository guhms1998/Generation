package br.com.generation.aula03;

import java.util.Scanner;

public class exemploLacoCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		double nota1, nota2, media;
		
		System.out.println("Digite 1a Nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite 2a Nota: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >=6.0) {
			System.out.println("Aprovado!");
			
		}
		else if(media >=3.0 && media < 6.0) {
			System.out.println("Recuperação");
		}
		
		else if(media >=0 && media < 10) 
		{
			System.out.println("reprovado!");
		}
		
		else {
			System.out.println("valores invalidos");
		}
		
		
		
		

	}

}
