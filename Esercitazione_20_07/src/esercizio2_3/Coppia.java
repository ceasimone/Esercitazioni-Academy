package esercizio2_3;

public class Coppia<T> {
	private T uno;
	private T due;
	
	public void salva(T uno, T due) {
		this.uno=uno;
		this.due=due;
	}
	
	public T prendiUno() {
		return this.uno;
	}
	
	public T prendiDue() {
		return this.due;
	}
}
