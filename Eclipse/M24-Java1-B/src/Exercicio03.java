import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base do " + "triangulo:");
		float base = sc.nextFloat();
		//Calculando a area do triangulo
		float altura = sc.nextFloat();
		//Calculando a area do triangulo
		float area = base * altura / 2;
		//mostrando a area
		System.out.println("A área do triangulo é "+area);
		//Fechando o scanner
		sc.close();
	}

}
