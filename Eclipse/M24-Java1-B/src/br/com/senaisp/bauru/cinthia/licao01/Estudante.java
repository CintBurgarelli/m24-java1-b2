package br.com.senaisp.bauru.cinthia.licao01;

import javax.management.RuntimeErrorException;

public class Estudante {
	//Campos ou Fields ou Variaveis de instância
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEstudo;
	//Constructors
	//Constructors padrão - sem parâmetros
	public Estudante() {
		id = 0;
		nome = "Sem nome";
		documento = "sem documento";
		media = 0.0f;
		fumante = false;
		bolsaEstudo = 0.0;
	}
	//Constructor personalizado
	public Estudante (int id, String nome, String documento,
			float media, double bolsa, boolean fum) {
		setId(id);
		setNome(nome);
		setDocumento(documento);
		setMedia(media);
		setBolsaEstudo(bolsa);
		setFumante(fumante);
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.media = media;
		bolsaEstudo = bolsa;
		fumante = fum;
	}

	
	
	
	//Gettes e setters
	//Metodos 	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()<2) {
			//Criando erro de execução
			throw new RuntimeErrorException(null, "Nome deve ter "  +
					 "pelo menos 2 caracteres");
		}
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public boolean isFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	public double getBolsaEstudo() {
		return bolsaEstudo;
	}
	public void setBolsaEstudo(double bolsaEstudo) {
		this.bolsaEstudo = bolsaEstudo;
	}
	//Metodos
	@Override
	public String toString() {
		//
		return  "id: " + getId() + "\n"  +
				"Nome: " + getNome()+"\n"+
				"Documento: " + getDocumento() + "\n"+
		        "Média: " + getMedia() +
		        "Bolsa de estudos: " + getBolsaEstudo() + "\n" +
		        "Fumante: " +isFumante();
	}
	
}
