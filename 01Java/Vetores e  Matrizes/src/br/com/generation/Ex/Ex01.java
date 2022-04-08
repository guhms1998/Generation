package br.com.generation.Ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int [5];
		int i, maior = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
		
		    vetor [i] = leia.nextInt();
		    if( i == 0) {
		    	maior = vetor[i];
		    }
		    if (vetor [i] > maior ) {
		    	maior = vetor[1];
		    }
		    System.out.println("\n0 maior número é o " + maior);
		    }

	}

}
