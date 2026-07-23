package esercizio4;

public class Main {

	public static void main(String[] args) {
		informazioni("Simone","Cea");
		
		String nome="Mario";
		String cognome="Rossi";
		
		informazioni(nome,cognome);

	}
	
	public static void informazioni(String nome, String cognome) {
		System.out.println("Nome: "+ nome + "\nCognome: "+ cognome+"\n");
	}

}
