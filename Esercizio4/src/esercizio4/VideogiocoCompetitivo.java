package esercizio4;

public class VideogiocoCompetitivo extends Videogioco implements Multiplayer{
	private double punteggio;

	public VideogiocoCompetitivo() {
	}

	public VideogiocoCompetitivo(String nome, double prezzo, int pegi) {
		super(nome, prezzo, pegi);
		
	}

	public VideogiocoCompetitivo(String nome, double prezzo, int pegi,double punteggio) {
		super(nome, prezzo, pegi);
		this.punteggio = punteggio;
	}

	public double getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(double punteggio) {
		this.punteggio = punteggio;
	}

	@Override
	public void gioca() {
		System.out.println("Sta giocando al videogioco competitivo " + getNome());
		
	}

	@Override
	public String toString() {
		return "VideogiocoCompetitivo [punteggio=" + punteggio + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sfida() {
		System.out.println("Inizia la sfida");
		
	}
	
	

}
