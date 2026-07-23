package esercizio2;

public class Quadrato {
	int lato;
	
	public Quadrato(){
		
	}
	
	public Quadrato(int lato) {
		this.lato=lato;
	}
	
	public int perimetro(int lato) {
		return lato *4;
	}
	
	public void area() {
		System.out.println("L'area del quadrato è: "+ this.lato * this.lato);
	}

}
