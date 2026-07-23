package esercizio5;

import java.util.ArrayList;
import java.util.List;

public class Square implements Shape,TwoDShape{
	private double lato;
	private Point2D punto= new Point2D();
	private List<Point2D> lista= new ArrayList<>();
	
	public Square() {
		
	}
	
	public Square(double lato, int x , int y) {
		this.lato=lato;
		punto.setX(x);
		punto.setY(y);
		memorizzaLista(x,y);
	}
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}
	
	public void posizioneAttuale() {
		System.out.println("\nPOSIZIONE ATTUALE DEL QUADRATO\n" + punto);
	}
	
	public void spostamento(int x, int y) {
		punto.setX(x);
		punto.setY(y);
		memorizzaLista(x,y);
		
	}
	
	public void listaSpostamenti() {
		System.out.println("\nLISTA SPOSTAMENTI");
		lista.forEach(i-> System.out.println(i+"\n"));
	}
	
	private void memorizzaLista(int x,int y) {
		Point2D nuovoPunto = new Point2D();
	    nuovoPunto.setX(x);
	    nuovoPunto.setY(y);
	    lista.add(nuovoPunto);
	}

	@Override
	public double area() {
		return (lato*lato);
	}

	@Override
	public double perimetro() {
		return (lato*4);
	}

	@Override
	public void draw() {
		System.out.println("Disegno il quadrato");
		
	}

}
