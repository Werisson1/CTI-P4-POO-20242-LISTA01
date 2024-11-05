package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int sal, salreceber, imp;
		
		sal = 80;
		imp = sal * 10/100;
		salreceber = sal + 50 - imp;
		System.out.println(salreceber);
	}

}
