package br.com.generation.metodos;

public class TesteEx02 {

	public static void main(String[] args) {
		
		Ex01 Cliente = new Ex01();
		
		Cliente.nome = "Gustavo";
		Cliente.endereço = "Rua Camargo";
		Cliente.cidade = "SBC";
		Cliente.cpf = "12345678912";
		Cliente.idade = 23;
		
		
		Cliente.imprimirInfo();
		
		
	}

}
