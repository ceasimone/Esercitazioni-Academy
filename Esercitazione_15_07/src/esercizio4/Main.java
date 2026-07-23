package esercizio4;

public class Main {

	public static void main(String[] args) {
	
	Studente[] studenti= new Studente[5];
	
	studenti[0]= new Triennale("Mario", "Rossi", 9000,4);
	studenti[1]= new Triennale("Luigi", "Bianchi", 19000,2);
	studenti[2]= new Triennale("Franco", "Battiato", 40000,6);
	studenti[3]= new Magistrale("Lupo", "Lucio", 15000,2);
	studenti[4]= new Magistrale("Pippo", "Franco", 5000,4);
	
	for(Studente s: studenti) {
		s.calcolaTasse(s);
	}
	
	}
}
