package medioevo;

public class Cavaliere extends Soldato{
	
	private String nomeCavallo;
	
	public Cavaliere() {
		
	}
	
	public Cavaliere(String nome, String arma, String nomeCavallo) {
		super(nome,arma);
		this.nomeCavallo=nomeCavallo;
	}
	
	public void setNomeCavallo(String nomeCavallo) {
		this.nomeCavallo=nomeCavallo;
	}
	
	public String getNomeCavallo() {
		return this.nomeCavallo;
	}

	@Override
	public void gridoDiBattaglia() {
		System.out.println("Il cavaliere ha detto:\n\nIo sono Pdor, figlio di Kmer, della tribù di Star!\nE sono colui che era, colui che è stato e colui che sempre sarà!\nIo sono colui che può leggere nel presente, nel passato, e anche nel congiuntivo!\nColui il quale ha sfidato e sconfitto i demoni Sem che ora vagano per il mondo!\nColui che è sceso nelle sacre acque del lago Fadir tra le ninfe Nigerals e lì ha assaggiato il mitico cibo degli dei:\nLA PIADEINA!");
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " || Nome Cavallo: " + this.nomeCavallo;
	}
	
}
