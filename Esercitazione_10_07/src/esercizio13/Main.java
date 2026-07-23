package esercizio13;

public class Main {

	public static void main(String[] args) {
		Studente s1= new Studente("Mario", 33, 3.6);
		Studente s2= new Studente("Simone", 29, 18.0);
		boolean temp;
		
		s1.stampaInfo();
		temp=s1.promosso();
		System.out.println("Lo studente "+ s1.nome + " è stato promosso? " + temp);
		s2.stampaInfo();
		temp=s2.promosso();
		System.out.println("Lo studente "+ s2.nome + " è stato promosso? " + temp);
	}

}
