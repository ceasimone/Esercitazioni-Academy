package geometria;

public class Triangolo extends FiguraGeometrica {
	private double lato1;
	private double lato2;
	private double lato3;
	
	public Triangolo() {
		
	}
	
	public Triangolo(double lato1, double lato2, double lato3) {
		this.setLato1(lato1);
		this.setLato2(lato2);
		this.setLato3(lato3);
	}
	
	@Override
	public void calcolaArea() {
		double semiper=((this.lato1+this.lato2+this.lato3)/2);
		System.out.println("L'area del triangolo è: " +  Math.sqrt(semiper*(semiper-lato1)*(semiper-lato2)*(semiper-lato3)));
		
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println("Il perimetro del tirangolo è: "+ (this.lato1+this.lato2+this.lato3));
	}

	public double getLato1() {
		return lato1;
	}

	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}

	public double getLato2() {
		return lato2;
	}

	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}

	public double getLato3() {
		return lato3;
	}

	public void setLato3(double lato3) {
		this.lato3 = lato3;
	}

}
