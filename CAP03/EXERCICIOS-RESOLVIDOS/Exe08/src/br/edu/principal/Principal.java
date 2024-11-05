package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int dep, taxa, rend, total;
		
		dep = 30;
		taxa = 10;
		rend = dep * taxa/100;
		total = dep + rend;
		
		System.out.println("Rendimento:" + rend);
		System.out.println("Total" + total);
	}

}
