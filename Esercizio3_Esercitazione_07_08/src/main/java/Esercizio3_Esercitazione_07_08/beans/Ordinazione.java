package Esercizio3_Esercitazione_07_08.beans;

public class Ordinazione {
	
	private int numeroOrdine;
	private Pizza pizza;
	public Ordinazione() {
		super();
	}
	public Ordinazione(int numeroOrdine, Pizza pizza) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.pizza = pizza;
	}
	public int getNumeroOrdine() {
		return numeroOrdine;
	}
	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String toString() {
		return "Ordinazone [numeroOrdine=" + numeroOrdine + ", pizza=" + pizza + "]";
	}
	

}
