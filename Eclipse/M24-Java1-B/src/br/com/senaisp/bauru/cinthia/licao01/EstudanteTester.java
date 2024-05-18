package br.com.senaisp.bauru.cinthia.licao01;

public class EstudanteTester {

	public static void main(String[] args) {
		// Criando um estudante
		Estudante est01 = new Estudante();
		//Atribuindi valor ao estudante 
		est01.setNome("Cinthia");
		est01.setId(1);
		est01.setMedia(5.5f);
		//Mostrando valores
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: "+est01.getDocumento());
		//Obtendo o objeto como representação textual
		System.out.println(est01.toString());
		//Criando um novo estudante
		Estudante est02 = new Estudante(2, "Cinthia",
				"12345678900", 9.6f, 1600.00, true);
		//Mostrando o estudante
		System.out.println(est02.toString());

	}

}
