package br.com.generation.classes01;

public class Veiculo {
	
	
	String marca;
	String cor;
	String tipo;
	String modelo;
	int ano;
	int velocidade;
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void freiar (int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
