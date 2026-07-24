package esercizio3;

public class Giocatore {
	private String nome;
	private String cognome;
	private double prezzo;
	
	public Giocatore() {
		super();
	}
	
	public Giocatore(String nome, String cognome, double prezzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Giocatore [nome=" + nome + ", cognome=" + cognome + ", prezzo=" + prezzo + "]";
	}
	
	

}
