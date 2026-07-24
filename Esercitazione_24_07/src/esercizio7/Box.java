package esercizio7;

public class Box {
	private double altezza;
	private double larghezza;
	private double profondita;
	
	public Box(double altezza, double larghezza, double profondita) throws UndiscoveredDimensionException{
		
		if(altezza<0 || larghezza <0 || profondita <0) {
			throw new UndiscoveredDimensionException("I valori sono minori di zero");
		}
		
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.profondita = profondita;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	public double getProfondita() {
		return profondita;
	}
	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}
	
	public boolean isContenuto(Box b) {
		if(this.altezza> b.getAltezza() && this.larghezza> b.getLarghezza() && this.profondita> b.getProfondita()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(Box b) {
		if(this.altezza== b.getAltezza() && this.larghezza== b.getLarghezza() && this.profondita== b.getProfondita()) {
			return true;
		}else {
			return false;
		}
	}

}
