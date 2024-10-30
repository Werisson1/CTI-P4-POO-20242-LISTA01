package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
double peso_saco, racao_gato1, racao_gato2, total_final;
		
		peso_saco = 32;
		racao_gato1 = 10;
		racao_gato2 = 20;
		
		racao_gato1 = racao_gato1 / 1000;
		racao_gato2 = racao_gato2 / 1000;
		
		total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		System.out.println(total_final);
	}

}


