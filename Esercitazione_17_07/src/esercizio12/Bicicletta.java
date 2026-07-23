package esercizio12;

public class Bicicletta {
	private String modello;
	private double prezzo;
	private boolean comprata;
	
	public Bicicletta() {
		
	}
	
	public Bicicletta(String modello, double prezzo) {
		this.setModello(modello);
		this.setPrezzo(prezzo);
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public boolean isComprata() {
		return comprata;
	}

	private void setComprata(boolean comprata) {
		this.comprata = comprata;
	}

	public static void compraBici(Bicicletta a, Bicicletta b) {
		a.setComprata(true);
		b.setComprata(true);
		
		if(a.getPrezzo()>b.getPrezzo()) {
			System.out.println(a + " costa più di " +b);
		}else if (a.getPrezzo()<b.getPrezzo()) {
			System.out.println(a + " costa meno di " +b);
		}else {
			System.out.println(a + " costa quanto " +b);
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Modello: " + this.modello + " Prezzo: " + this.prezzo;
	}
	
	
	
}
