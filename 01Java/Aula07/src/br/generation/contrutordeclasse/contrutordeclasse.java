package br.generation.contrutordeclasse;

import java.util.Scanner;

public class contrutordeclasse {
	
	public static void main(String[] args) {
		
	
	Scanner entrada = new Scanner(System.in)
	System.out.println("Digite o nome: ");
	String n = entrada.nextLine();
	int i =  entrada.nextInt();
	
	Pessoa p1 = new Pessoa(n, i);
	
	System.out.println(p1.nome);
	System.out.println(p1.idade);
			
		
	}
		
	
}
