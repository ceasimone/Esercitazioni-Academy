package esercizio4;

public class Triennale extends Studente{
	private static int tassa= 10;
	private boolean incorso;
	
	public Triennale() {
		
	}
	
	public Triennale(String nome,String cognome,double isee, int annoCorso) {
		super(nome,cognome,isee,annoCorso);
		this.setInCorso(controlloAnnoCorso(annoCorso));
	}
	
	private boolean controlloAnnoCorso(int annoCorso) {
		if(annoCorso<=3) {
			return true;
		}else {
			return false;
		}
	}

	public int getTassa() {
		return tassa;
	}

	public boolean isInCorso() {
		return incorso;
	}

	public void setInCorso(boolean incorso) {
		this.incorso = incorso;
	}
	
}
