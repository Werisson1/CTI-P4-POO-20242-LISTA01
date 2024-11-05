package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double p_fab, perc_d, perc_i, vlr_i, vlr_d, p_final;
		
		p_fab = 1000;
		perc_d =  4;
		perc_i  = 3;
		
		vlr_d = p_fab * perc_d / 100;
		vlr_i = p_fab * perc_i / 100;
		p_final = p_fab + vlr_d + vlr_i;
		
		System.out.println(p_fab);
		System.out.println(vlr_d);
		System.out.println(vlr_i);
		System.out.println(p_final);
		
		

	}

}
