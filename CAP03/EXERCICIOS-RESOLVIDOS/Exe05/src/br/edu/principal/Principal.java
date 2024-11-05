package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int sal, perc, aumento, novosal;
		
		sal = 70;
		perc = 10;
		
		aumento = sal * perc/100;
		
		System.out.println("O valor do aumento é: " + aumento);
		
		novosal = sal + aumento;
		
		System.out.println("O valor do novo salário é: " + novosal);


	}

}
