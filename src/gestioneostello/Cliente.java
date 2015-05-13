package gestioneostello;

public class Cliente {
	private String nome;
	private String cognome;
	private String numerotelefono;
	
	public Cliente(String nome, String cognome, String numerotelefono) {
		if(nome.length()==0)
			throw new IllegalArgumentException ("non puo essere 0");
		if(nome == null)
			throw new IllegalArgumentException ("Il nome non può essere null");
			this.nome = nome;
		if(cognome.length()==0)
			throw new IllegalArgumentException ("non puo essere 0");
		if(cognome == null)
			throw new IllegalArgumentException ("il cognome non può essere null");
			this.cognome = cognome;
		if(numerotelefono.length()==0)
			throw new IllegalArgumentException ("non puo essere 0");
		if(numerotelefono== null)
			throw new IllegalArgumentException ("Il numero di telefono non può essere null");
			this.numerotelefono = numerotelefono;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNumerotelefono() {
		return numerotelefono;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome
				+ ", numerotelefono=" + numerotelefono + "]";
	}
	
	


}
