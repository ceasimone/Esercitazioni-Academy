package esercizio4;

public class Magistrale extends Studente{
	private static int tassa= 15;
	private boolean incorso;
	
	public Magistrale() {
		
	}
	
	public Magistrale(String nome,String cognome,double isee, int annoCorso) {
		super(nome,cognome,isee,annoCorso);
		this.setInCorso(controlloAnnoCorso(annoCorso));
	}

	
	private boolean controlloAnnoCorso(int annoCorso) {
		if(annoCorso<=2) {
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
