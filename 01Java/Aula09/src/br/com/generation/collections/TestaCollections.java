package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {
	
	public static void main(String[] args) {
	
		String aula1 = "Aoloco I - Back do Backend";
		String aula2 = "Bloco II - SpringBoot BackEnd";
		String aula3 = "CLoco III - Frontend";
	
	ArrayList<String> aulas = new ArrayList<>();
	
	aulas.add(aula1);
	aulas.add(aula2);
	aulas.add(aula3);
	
	/*System.out.println(aulas);
	aulas.remove(0);
	System.out.println(aulas);*/
	
	//for --> each
	
	/*for(String i: aulas) {
		System.out.println(aula);
	}*/
	
	/*String segundaAula = aulas.get(1);
	System.out.println(aulas.get(0));
	System.out.println(segundaAula);*/
	
	/*for(int i = 0; i < aulas.size(); i++) {
		System.out.println(i +" Aula: "+ aulas.get(i));
	}*/
	
	Collections.sort(aulas);
	System.out.println(aulas);
	
	}

}
