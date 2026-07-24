package esercizio5;

import esercizio4.Lampadina;

public class Interruttore {
	private Lampadina lampadina;
	
	public Interruttore() {
		
	}
	
	public Interruttore(Lampadina lampadina) {
		this.setLampadina(lampadina);
	}

	public Lampadina getLampadina() {
		return lampadina;
	}

	public void setLampadina(Lampadina lampadina) {
		this.lampadina = lampadina;
	}
	
	public void click() {
		lampadina.click();
	}
	
	
}
