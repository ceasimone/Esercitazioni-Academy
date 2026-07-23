package esercizio2;

public class TestQuadrato {

	public static void main(String[] args) {
		
		Quadrato q1= new Quadrato(7);
		System.out.println("Il perimetro del quadrato è: "+ q1.perimetro(q1.lato));
		q1.area();
		
		
		Quadrato q2= new Quadrato(5);
		System.out.println("Il perimetro del quadrato è: "+ q2.perimetro(5));
		q2.area();
		
	}

}
