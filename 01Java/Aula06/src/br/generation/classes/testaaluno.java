package br.generation.classes;

public class testaaluno {

	public static void main(String[] args) {
		
		Aluno objetoaluno = new Aluno();
		Aluno objetoaluno2 = new Aluno();
		
		
		objetoaluno.nome = "Gustavo";
		objetoaluno.curso = "Generation";
		objetoaluno.idade = 22;
		
		
		objetoaluno2.nome = "Jessica";
		objetoaluno2.curso = "Mobile";
		objetoaluno2.idade = 23;
		
		System.out.println("Nome do aluno  " + objetoaluno.nome);
		System.out.println("Nome do curso  " + objetoaluno.curso);
		System.out.println("idade " + objetoaluno.idade);
		
		System.out.println("\nNome do aluno  " + objetoaluno.nome);
		System.out.println("Nome do curso  " + objetoaluno.curso);
		System.out.println("idade " + objetoaluno.idade);
		

	}

}
