package gestioneostello;
import java.time.*;

public class Prenotazione {
	private int postirichiesti;
	private LocalDateTime dal;
	private LocalDateTime al;
	private double costogiornaliero;
	private Cliente cliente;
	private Stanza stanza;
	public Prenotazione(int postirichiesti, LocalDateTime dal,
			LocalDateTime al, double costogiornaliero, Cliente cliente,
			Stanza stanza) {
		if(postirichiesti <= 0)
			throw new IllegalArgumentException("Deve essere positivo");
		else
			this.postirichiesti = postirichiesti;
		this.dal = dal;
		this.al = al;
		if(costogiornaliero<= 0)
			throw new IllegalArgumentException("Deve essere positivo");
		else
			this.costogiornaliero = costogiornaliero;
		this.cliente = cliente;
		this.stanza = stanza;
	}
	public int getPostirichiesti() {
		return postirichiesti;
	}
	public LocalDateTime getDal() {
		return dal;
	}
	public LocalDateTime getAl() {
		return al;
	}
	public double getCostogiornaliero() {
		return costogiornaliero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Stanza getStanza() {
		return stanza;
	}

	public void setStanza(Stanza stanza) {
		if(stanza== null)	
			throw new IllegalArgumentException("Stanza non può essere null");
		else
			this.stanza = stanza;
	}
	public void setPostirichiesti(int postirichiesti) {
		if(postirichiesti<=0)
			throw new IllegalArgumentException("deve essere positivo");
		else
		this.postirichiesti = postirichiesti;
	}
	 
}
