package esercizio6;

public class Lampadina {
	private static boolean corrente;
	private int massimo;
	private int scorrimento;
	private int casi;
	
	public Lampadina(int massimo) {
		this.massimo=massimo;
		this.scorrimento=massimo;
		this.casi=1;
		corrente=true;
	}
	
	public int getMassimo() {
		return massimo;
	}

	public static boolean getCorrente() {
		return corrente;
	}

	public static void setCorrente(boolean corrente) {
		Lampadina.corrente = corrente;
	}

	public void stato() {
		if(getCorrente()==true) {
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
		}else {
			switch(this.casi) {
			case 1:
			case 2:
				System.out.println("La lampadina è spenta");
				break;
			case 3:
				System.out.println("La lampadina è rotta");
				break;
		}	
		}
	}
	
	public void click() {
		if(getCorrente() == true) {
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
		}
		System.out.println("CLICK!");
	}
	

}
