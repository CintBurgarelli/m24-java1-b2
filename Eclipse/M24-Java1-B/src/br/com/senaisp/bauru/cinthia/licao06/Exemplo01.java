package br.com.senaisp.bauru.cinthia.licao06;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores;
		System.out.println("Digite i número de elementos " 
				+ "que você deseja?");
		int qtde = sc.nextInt();
		valores = new int[qtde];
		//Laço de repetição para solicitar os números
		for(int i=0;i<valores.length;i++) {
			System.out.println("Digite o elemento "+(i+1)+":");
			valores[i] = sc.nextInt();
		}
		//Qual seria o valor digitado?
		//Qual a media dos valores?
		//Qual seria os valores?
		int maior=Integer.MIN_VALUE,soma=0; 
		for(int el : valores) {
			soma += el;//soma = soma + el
			if (el>maior) {
				maior = el;
			}
		}
		//Mostrando os valores
				System.out.println("Maior valor: " + maior);
				System.out.println("Média: " + (soma * 1.0 / valores.length));
				System.out.println("Soma: " + soma);
				sc.close();

	}
	

}
