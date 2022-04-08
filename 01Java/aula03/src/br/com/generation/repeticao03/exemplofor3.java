package br.com.generation.repeticao03;

public class exemplofor3 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe = 0, desce = 10; sobe <= 10 && desce >=0; sobe++, desce--) {
			System.out.println(sobe + " | " + desce);
			Thread.sleep(500);
			if(sobe == 0) {
				System.out.println("uhul");
			}
			else {
				System.out.println("alo");
			}
		}

	}

}
