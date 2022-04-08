package br.com.generation.aula03;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
				
		System.out.println("Escreva uma letra entre a e d: ");
		String letra =  entrada.nextLine();
		
		switch(letra) {
		      case "a", "A", "1":
		    	  System.out.println("ana");
		    	  break;
		      case "b":
		           System.out.println("bruna");
		           break;
		      case "c":
	               System.out.println("carlos");
	               break;
		      case "d":
	               System.out.println("daniel");
	                break;
	          default:
	        	   System.out.println("Operacao invalida!!");
	        	   break;
		}

	}

}
