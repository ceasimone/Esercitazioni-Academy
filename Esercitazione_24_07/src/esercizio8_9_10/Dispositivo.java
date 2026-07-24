package esercizio8_9_10;

public class Dispositivo {
	private String nome;
	private double prezzo;
	private SistemaOperativo sistemaoperativo;
	
	public Dispositivo() {
		super();
	}
	public Dispositivo(String nome, double prezzo, SistemaOperativo sistemaoperativo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.sistemaoperativo = sistemaoperativo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public SistemaOperativo getSistemaoperativo() {
		return sistemaoperativo;
	}
	public void setSistemaoperativo(SistemaOperativo sistemaoperativo) {
		this.sistemaoperativo = sistemaoperativo;
	}
	@Override
	public String toString() {
		return "Dispositivo [nome=" + nome + ", prezzo=" + prezzo + ", sistemaoperativo=" + sistemaoperativo + "]";
	}
	
	

}
