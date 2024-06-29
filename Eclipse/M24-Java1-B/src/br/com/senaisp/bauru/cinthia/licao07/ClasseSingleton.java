package br.com.senaisp.bauru.cinthia.licao07;
/*
 * Exemplo de uso por padrão Singleton no Java
 */
public class ClasseSingleton {
	private static ClasseSingleton instancia = null;
	private static int nSeqInstancia = 0;
	private int id;
	private String nome;
	//Constructor
	private ClasseSingleton() {
		id = ++nSeqInstancia;
		nome = null;
		
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	//Metodos 
	public static ClasseSingleton getInstancia() {
		if ( instancia==null ) {
			instancia = new ClasseSingleton();
		}
		return instancia;
	}
}
