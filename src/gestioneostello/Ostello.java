package gestioneostello;
import java.util.*;
public class Ostello {
	private String nome;
	private Vector<Stanza>stanze;
	
	public String getNome() {
		return nome;
	}


	public Vector<Stanza> getCamere() {
		return stanze;
	}


	public Ostello(String nome) {
		this.nome = nome;
		this.stanze = new Vector<Stanza>();
	}
	
}
