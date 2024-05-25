import java.util;
public class ExercicioString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings
		String nome1 = "Cinthia";
		String nome2 = "Cinthia";
		//Solicitando os nomes
		System.out.println("Digite o Nome");
		nome2 = sc.next();
		//comparando endereço de memória quando 
		if (nome1 == nome2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		//Comparando conteudo de objeto
		if (nome1.equals(nome2)) {
			System.out.println("São iguais no conteúdo");
		} else {
			System.out.println("São diferentes no conteúdo");
		}
		if (nome1.compareTo(nome2)>0) {
			System.out.println("Nome1 é maior que nome 2");
		}
		if (nome1.compareTo(nome2)<0) {
			System.out.println("Nome1 é maior que nome 1");
		}
		if (nome1.compareTo(nome2)==0) {
			System.out.println("Nome1 é igual o nome 2");
		}
	}

}
