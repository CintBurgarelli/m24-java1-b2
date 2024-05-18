package br.com.senaisp.bauru.cinthia.licao01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// TODO Auto-generated method stub
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//Solicitar a entrada via teclado pelo usuário
		System.out.println("Digite a quantidade de galoes:");
		galoes = scn.nextDouble();
		
		//Fazendo as contas 
		litros = galoes * gal2lt;
		//Mostrar resultado 
		System.out.println(galoes + " galões equivale a "+
		                   litros + " litros");
		scn.close();
	}

}
