package medioevo;

public abstract class Soldato  {
	
	private String nome;
	private String arma;
	
	public Soldato() {
		
	}
	
	public Soldato(String nome, String arma) {
		this.nome=nome;
		this.arma=arma;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma=arma;
	}
	
	public void combatti() {
		System.out.println("Il Soldato " + this.nome + " sta combattendo");
	}
	
	public void riposa() {
		System.out.println("Il Soldato " + this.nome + " sta riposando");
	}
	
	public void avaza() {
		System.out.println("Il Soldato " + this.nome + " sta avanzando");
	}
	
	public abstract void gridoDiBattaglia();
	
	@Override
	public String toString() {
		return "Nome: "+ this.nome + " || Arma: " + this.arma;
	}
	
	
	
}
