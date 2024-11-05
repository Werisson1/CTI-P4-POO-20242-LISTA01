package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num, quad, cubo, r2, r3;
		num = 5;
		quad = Math.pow(num , 2);
		cubo = Math.pow(num , 3);
		r2 = Math.pow(num , 1/2);
		r3 = Math.pow(num , 1/3);
		
		System.out.println(quad);
		System.out.println(cubo);
		System.out.println(r2);
		System.out.println(r3);

	}

}
