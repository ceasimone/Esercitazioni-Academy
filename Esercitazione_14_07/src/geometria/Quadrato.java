package geometria;

public class Quadrato extends FiguraGeometrica{
	
	private double lato;
	
	public Quadrato() {
		
	}
	
	public Quadrato(double lato) {
		this.lato=lato;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	
	@Override
	public void calcolaArea() {
		System.out.println("L'area del quadrato è: " + (this.lato*this.lato));
		
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println("Il perimetro del quadrato è: " + (this.lato*latiquadrato));
	}

}
