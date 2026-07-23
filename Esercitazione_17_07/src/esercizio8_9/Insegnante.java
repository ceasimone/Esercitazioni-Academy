package esercizio8_9;

public class Insegnante extends Persona {
	private String materia;
	
	public Insegnante() {
		
	}
	
	public Insegnante(String nome, String cognome, int eta, String materia) {
		super(nome,cognome,eta);
		this.setMateria(materia);
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void insegna() {
		System.out.println("L'insegnante sta facendo lezione");
	}
	
	@Override
	public String toString() {
		return super.toString() +"\nMateria: " + this.materia;
	}

}
