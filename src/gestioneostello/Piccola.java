package gestioneostello;

public class Piccola extends Stanza{
	private double costogiornaliero;
	public Piccola(String numero, double costogiornaliero) {
		super(numero, 4);
		if(costogiornaliero<=0)
			throw new IllegalArgumentException("Deve essere positivo");
		else
		this.costogiornaliero = costogiornaliero;

	}
	public double getCostogiornaliero() {
		return costogiornaliero;
	}
	public void setCostogiornaliero(double costogiornaliero) {
		if(costogiornaliero<=0)
			throw new IllegalArgumentException("Deve essere positivo");
		else
		this.costogiornaliero = costogiornaliero;
	}

}
