import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Utilizando o Scanner para separar os nomes
		//Passando a entrada para nome
		Scanner scA = new Scanner(nome);
		String primeiroNome="", ultimoNome="";
		//utilizando o laço while
		while (scA.hasNext()) {
			ultimoNome = scA.next();
			if (primeiroNome.equals("")) {
				primeiroNome = ultimoNome;
			}
		}
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Ultimo nome: " + ultimoNome);
		//fechando os scanners
		scA.close();
		sc.close();
	}
	

}
