package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double hora, h, m, conversao;
		hora = 22.17;
		h = (int) hora;
		m = hora - h;
		conversao = (h * 60) + (m * 100);
		System.out.println(conversao);
		

	}

}
