package esercizio8_9;

public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona() {
		
	}
	
	public Persona(String nome,String cognome,int eta) {
		this.setNome(nome);
		this.setCognome(cognome);
		this.setEta(eta);
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome +
			   "\nCognome: " +  this.cognome +
			   "\nEtà: " + this.eta;
	}
	
}
