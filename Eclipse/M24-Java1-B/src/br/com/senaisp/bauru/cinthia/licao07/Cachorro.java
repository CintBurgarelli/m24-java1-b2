package br.com.senaisp.bauru.cinthia.licao07;

public class Cachorro extends Mamifero{
	//Campos /Fields
	private boolean quadrupede;
	//Constructor
	//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Metodos
	public void falar() {
		System.out.println("Au au au!");
	}
	@Override
	public String toString() {

		return super.toString()+
				"Quadrupede: " + quadrupede+ "\n";
	}
	

}
