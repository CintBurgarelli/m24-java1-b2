package br.com.senaisp.bauru.cinthia.licao01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String nome;
		//Mostrando a mensagem para usuário
		System.out.println("Digite seu nome completo:");
		nome = scn.nextLine() + " ";
		//Vamos separar nome de sobrenome
		String primNome = nome.substring(0,(nome+" ").indexOf(" "));
		//Pegar o ultimo sobrenome
		
		String lastName = nome.substring(nome.lastIndexOf(" "));
		//Mostrando o nome
		System.out.println(primNome);
		System.out.println (lastName);
		//Fechando scanner
		scn.close();
	}

}
