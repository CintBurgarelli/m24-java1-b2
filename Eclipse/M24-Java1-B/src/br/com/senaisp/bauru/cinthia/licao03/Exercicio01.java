package br.com.senaisp.bauru.cinthia.licao03;

public class Exercicio01 {
	public static int _idade = 18;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte vByte = 127;
		vByte++; //aqui ocorre o estouro do limite do byte
		System.out.println(vByte); //mostra o limite infelior
		float vFloat = 6_000.00f; //preciso colocar f para dizer que é float
		if (vByte == -128) {
			String nome = "Cinthia";
			System.out.println("Meu nome é" + nome);
		}
		//aqui não é uma variavel
		//System.out.println(nome);
		//alteradi a variavel idade
		_idade = 20;
		System.out.println(_idade);
		//a partir desse ponto passa a usar a variavel local
		int idade = 50;
		System.out.println(idade);
		idade += 20; //somando 20 a idade
		System.out.println(idade);
	}

}
