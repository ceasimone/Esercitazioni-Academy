package esercizio4;

public class Lampadina {
	private int massimo;
	private int scorrimento;
	private int casi;
	
	public Lampadina(int massimo) {
		this.massimo=massimo;
		this.scorrimento=massimo;
		this.casi=1;
	}
	
	public int getMassimo() {
		return massimo;
	}

	public void stato() {
		switch(this.casi) {
		case 1:
			System.out.println("La lampadina è spenta");
			break;
		case 2:
			System.out.println("La lampadina è accesa");
			break;
		case 3:
			System.out.println("La lampadina è rotta");
			break;
		}
	}
	
	public void click() {
		if(casi==1) {
			if(this.scorrimento>0) {
				this.casi=2;
				this.scorrimento --;
			}else {
				this.casi=3;
			}
		}else if(casi==2) {
			this.casi=1;
		}
		System.out.println("CLICK!");
	}
	

}
