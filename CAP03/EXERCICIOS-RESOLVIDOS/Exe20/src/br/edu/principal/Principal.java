package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double ang, alt, escada, radiano;
		
		ang = 30;
		alt = 80;
		escada = 40;
		radiano = ang * 3.14 / 180;
		escada = alt / Math.sin(radiano);
		
		System.out.println(escada);

	}

}
