package br.com.senaisp.bauru.cinthia.licao06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] [] cinema = new String[10] [10];
		//inicialiazando o cinema
		for(int i=0;i<cinema.length;i++) { //fileiras
			for (int j=0;j<cinema[i].length;j++) { //poltronas
				cinema[i][j] = "-";
			}
		}
		//Comprando os ingressos
		String term;
		mostrarPoltronas(cinema);
		do {
			System.out.println("Qual fileira você deseja?");
			int fl = sc.nextInt();
			System.out.println("Qual poltrona você deseja?");	
			int po = sc.nextInt();
			//Verificando se esta disponiveç
			try {
				if (cinema[fl-1][po-1].equals("-")) {
					cinema[fl-1][po-1] = "X";
				} else {
					System.out.println("Não disponível!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Mostrando poltronas
			mostrarPoltronas(cinema);
			System.out.println("Deseja continuar (S/N)?");
			sc.nextLine();
			term = sc.nextLine();
		} while(!term.equalsIgnoreCase("N"));
		sc.close();

	}

	private static void mostrarPoltronas(String[][] cinema) {
		for(int i=0;i<cinema.length;i++) { //fileiras
			System.out.print("FL " + (i<9 ? " ": "") +
					                 (i+1)+ " ");
			for (int j=0;j<cinema[i].length;j++) { //poltronas
				System.out.println(cinema[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
