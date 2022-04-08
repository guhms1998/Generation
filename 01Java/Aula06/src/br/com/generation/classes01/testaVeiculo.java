package br.com.generation.classes01;

public class testaVeiculo {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		Veiculo moto = new Veiculo();
		
		carro.tipo = "hatch";
		carro.modelo = "Fusca";
		carro.marca = "Volkwagen";
		carro.ano = 1985;
		carro.cor = "Azul";
		carro.velocidade = 0;
		
		carro.acelerar(60);
		System.out.println(carro.modelo);
		System.out.println(carro.tipo);
		System.out.println("Velocidade: " + carro.velocidade);
		System.out.println();
		
		carro.freiar(30);
		System.out.println(carro.modelo);
		System.out.println(carro.tipo);
		System.out.println("Velocidade: " + carro.velocidade);
		System.out.println();
		
		moto.modelo = "fan";
		moto.marca = "honda";
		moto.velocidade = 0;
		
		System.out.println(moto.modelo);
		System.out.println("velocidade: " + moto.velocidade);
		
				
		

	}

}
