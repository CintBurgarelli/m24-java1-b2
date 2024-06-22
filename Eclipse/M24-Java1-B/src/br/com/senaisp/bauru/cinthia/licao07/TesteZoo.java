package br.com.senaisp.bauru.cinthia.licao07;

public class TesteZoo {

	public static void main(String[] args) {
		Mamifero mam = new Cachorro() ;
        mam.setCor("Caramelo");
        mam.setNome("Totó");
        mam.setIdade(3);
        if (mam instanceof Cachorro) {
        	((Cachorro) mam) .setQuadrupede(true);
        }
        
        mam.falar();
        System.out.println(mam.toString());
	}

}
