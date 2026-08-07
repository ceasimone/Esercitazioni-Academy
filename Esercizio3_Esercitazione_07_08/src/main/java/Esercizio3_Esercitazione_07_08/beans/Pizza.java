package Esercizio3_Esercitazione_07_08.beans;

public class Pizza {
	private String tipo;
	private String ingredienti;
	
	public Pizza() {
		super();
	}
	public Pizza(String tipo, String ingredienti) {
		super();
		this.tipo = tipo;
		this.ingredienti = ingredienti;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}
	@Override
	public String toString() {
		return "Pizza [tipo=" + tipo + ", ingredienti=" + ingredienti + "]";
	}
	
}
