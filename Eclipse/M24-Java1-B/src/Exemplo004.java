import java.util.Scanner;

public class Exemplo004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Exemplo004.
				class.getResourceAsStream("Dados.cvs"));
		String linha = sc.nextLine(); //linha do cabeçalho
		Scanner scA = new Scanner(linha);
		scA.useDelimiter(";"); //colocando como delimitador o ;
		// usando o laço - impressão do cabeçalho
		while(scA.hasNext()) {
			System.out.print(scA.next() + "\t\t");
		}
		System.out.println();
		// fechando o scanner
		scA.close();
		//percorrendo os iten do arquivo
		while (sc.hasNext()) {
			linha = sc.nextLine();
			scA = new Scanner(linha);
			scA.useDelimiter(";");
			while (scA.hasNext()) {
				System.out.println(scA.next()+"\t");
			}
			System.out.println(); //pulando a linha
			scA.close(); //fechando a linha
					
		}
		sc.close(); //fechando o arquivo

	}

}
