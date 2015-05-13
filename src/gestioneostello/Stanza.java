package gestioneostello;
import java.time.LocalDateTime;
import java.util.*;
public class Stanza {
	private String numero;
	private int Postiletto;
	private Vector<Prenotazione>prenotazioni;
	private double costogiornaliero;
	
	public Stanza(String numero, int postiletto) {
		if(numero == null)
			throw new IllegalArgumentException("Non può essere nullo");
		this.numero = numero;
		if(postiletto<=0)
			throw new IllegalArgumentException("deve essere positivo");
		Postiletto = postiletto;
		if(costogiornaliero<=0)
			throw new IllegalArgumentException("deve essere positivo");
		this.prenotazioni =  new Vector<Prenotazione>();
	}
	
	public String getNumero() {
		return numero;
	}
	
	public int getPostiletto() {
		return Postiletto;
	}
	
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	
	public boolean isDisponibile(LocalDateTime dal, LocalDateTime al, int postirichiesti){
		boolean r=true;
		for(int i=0;i<prenotazioni.size();i++)
		{
		}
		
	}
	
	public void addPrenotazione(Prenotazione p){
		if(p!= null){
			
		}
		}
	public double getCostoGiornaliero() {
		return this.costogiornaliero;
	}
	@Override
	public String toString() {
		return "Stanza [numero=" + numero + ", Postiletto=" + Postiletto
				+ ", prenotazioni=" + prenotazioni + ", costogiornaliero="
				+ costogiornaliero + "]";
	}
}
