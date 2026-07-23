package medioevo;

public class Fante extends Soldato {
	double andamentoPasso;
	
	public Fante() {
		
	}
	
	public Fante(String nome, String arma) {
		super(nome,arma);
	}
	
	public Fante(String nome, String arma, double andamentoPasso) {
		super(nome,arma);
		this.andamentoPasso=andamentoPasso;
	}

	@Override
	public void gridoDiBattaglia() {
		System.out.println("Il fante ha detto:\n\nMi chiamo Massimo Decimo Meridio, comandante dell'esercito del Nord,\ngenerale delle legioni Felix, servo leale dell'unico vero imperatore Marco Aurelio.\nPadre di un figlio assassinato, marito di una moglie uccisa... e avrò la mia vendetta, in questa vita o nell'altra.");
	}
	
	@Override
	public String toString() {
		return super.toString() + " || Andamento passo: " + this.andamentoPasso + "m/s";
	}
	
}
