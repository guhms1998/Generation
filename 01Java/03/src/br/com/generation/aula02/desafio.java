package br.com.generation.aula02;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		
		double galoes, litros = 0;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite galoes ");
		galoes = leia.nextDouble();
		
		litros = galoes * 5;
		
		System.out.println(galoes + " Galoes são " + litros + " litros");
		
		

	}

}
