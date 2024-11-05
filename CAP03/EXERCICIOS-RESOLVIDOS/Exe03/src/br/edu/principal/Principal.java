package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int nota1, nota2, nota3, peso1, peso2, peso3, media;
		nota1 = 5;
		nota2 = 7;
		nota3 = 8;
		peso1 = 4;
		peso2 = 9;
		peso3 = 6;
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
				
		
		System.out.println("A média ponderada é igual a: " +media);

	}

}
