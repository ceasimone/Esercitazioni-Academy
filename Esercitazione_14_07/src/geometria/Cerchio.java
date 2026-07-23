package geometria;

public class Cerchio extends FiguraGeometrica{
	
	private double raggio;
	
	public Cerchio() {
		
	}
	
	public Cerchio(double raggio) {
		this.setRaggio(raggio);
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public void calcolaArea() {
		System.out.println("L'area del cerchio è: " + (this.raggio*this.raggio*pi));
		
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println("Il perimetro del cerchio è: " + (2*pi*this.raggio));
		
	}
	
	

}
