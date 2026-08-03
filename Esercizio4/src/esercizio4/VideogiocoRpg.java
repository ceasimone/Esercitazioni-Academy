package esercizio4;

public class VideogiocoRpg extends Videogioco{
	
	private double puntiSalute;
	private double puntiMagia;
	
	

	public VideogiocoRpg() {
		super();
	}



	public VideogiocoRpg(String nome, double prezzo, int pegi) {
		super(nome, prezzo, pegi);
		// TODO Auto-generated constructor stub
	}
	
	



	public VideogiocoRpg(String nome, double prezzo, int pegi,double puntiSalute, double puntiMagia) {
		super(nome, prezzo, pegi);
		this.puntiSalute = puntiSalute;
		this.puntiMagia = puntiMagia;
	}



	public double getPuntiSalute() {
		return puntiSalute;
	}



	public void setPuntiSalute(double puntiSalute) {
		this.puntiSalute = puntiSalute;
	}



	public double getPuntiMagia() {
		return puntiMagia;
	}



	public void setPuntiMagia(double puntiMagia) {
		this.puntiMagia = puntiMagia;
	}



	@Override
	public void gioca() {
		System.out.println("Sta giocando al videogioco RPG " + getNome());
		
	}



	@Override
	public String toString() {
		return "VideogiocoRpg [puntiSalute=" + puntiSalute + ", puntiMagia=" + puntiMagia + ", toString()="
				+ super.toString() + "]";
	}
	

}
