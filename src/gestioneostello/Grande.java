package gestioneostello;

public class Grande extends Stanza{
	private double costogiornaliero;
	public Grande(String numero, double costogiornaliero) {
		super(numero, 8);
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
