package esercizio5;

public class Auto {
	private String nome;
	private String scuderia;
	
	public Auto() {
		
	}
	
	public Auto(String nome, String scuderia) {
		this.setNome(nome);
		this.setScuderia(scuderia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getScuderia() {
		return scuderia;
	}

	public void setScuderia(String scuderia) {
		this.scuderia = scuderia;
	}
	

}
