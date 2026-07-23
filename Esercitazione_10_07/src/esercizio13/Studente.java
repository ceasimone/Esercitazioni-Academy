package esercizio13;

public class Studente {
	String nome;
	int eta;
	double votoMedio;
	
	public Studente() {
		
	}
	
	public Studente(String nome, int eta, double votoMedio) {
		this.nome=nome;
		this.eta=eta;
		this.votoMedio=votoMedio;
	}
	
	public void stampaInfo() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("eta: "+ this.eta);
		System.out.println("voto: "+ this.votoMedio);
	}
	
	public boolean promosso(){
		boolean temp=false;
		if(this.votoMedio>=6) {
			temp=true;
		}
		
		return temp;
	}

}
