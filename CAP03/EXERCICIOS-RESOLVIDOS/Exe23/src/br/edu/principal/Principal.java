package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
	double num, i, f, a;
	num = 78.7869;
	i = (int) Math.floor(num);
	f = num - i;
	a = Math.round(num);
	
	System.out.println(i);
	System.out.println(f);
	System.out.println(a);
	

	}

}
