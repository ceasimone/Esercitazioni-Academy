package esercizio3;

public class Viaggio {
	String nome;
	int durata;  //CALCOLATA IN ORE
	double costo;
	boolean flag;
	
	public Viaggio() {
		
	}
	
	public Viaggio(String nome, int durata, double costo) {
		this.nome=nome;
		this.durata=durata;
		this.costo=costo;
	}
	
	public void confrontoCosto(String nome, double costo) {
		if(this.costo> costo) {
			this.flag=true;
		}else {
			this.flag=false;
		}
		System.out.println("Il viaggio " + this.nome + " rispetto al viaggio "+ nome + " costa di più?\n" + this.flag + "\n");
	}
	
	public void confrontoDurata(Viaggio v2) {
		if(this.durata> v2.durata) {
			this.flag=true;
		}else {
			this.flag=false;
		}
		System.out.println("Il viaggio " + this.nome + " rispetto al viaggio "+ v2.nome + " dura di più?\n" + this.flag + "\n");
	}
	
	public void costoOrario() {
		double temp;
		temp=this.costo / this.durata;
		System.out.println("Il viaggio ha un costo di "+ temp + " all'ora");
	}
	
	public void informazioni() {
		System.out.println("Il viaggio verso: "+ this.nome +" ha una durata di: "+ this.durata + " ore e un costo di: " + this.costo + " euro");
	}
	
}
