package geometria;

public class TestFigureGeometriche {

	public static void main(String[] args) {
		
		Quadrato q1= new Quadrato(5.0);
		q1.calcolaArea();
		q1.calcolaPerimetro();
		
		Triangolo t1= new Triangolo(2.3,3.5,4.6);
		t1.calcolaArea();
		t1.calcolaPerimetro();
		
		Cerchio c1= new Cerchio(6.5);
		c1.calcolaArea();
		c1.calcolaPerimetro();
		

	}

}
