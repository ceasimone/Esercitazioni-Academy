package esercizio14;

public class ContoCorrente {
	String numeroConto;
	String intestatario;
	double saldo;
	
	public ContoCorrente() {
		
	}
	public ContoCorrente(String numeroConto,String intestatario,double saldo) {
		this.numeroConto=numeroConto;
		this.intestatario=intestatario;
		this.saldo=saldo;
	}
	
	void deposita(double importo) {
		this.saldo += importo;
	}
	
	boolean preleva(double importo) {
		boolean temp=false;
		
		if(this.saldo>=importo) {
			this.saldo -= importo;
			temp=true;
		}
		
		return temp;
	}
	
	void stampaConto() {
		System.out.println("Numero conto: "+ this.numeroConto);
		System.out.println("Intestatario: "+ this.intestatario);
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("\n");
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	
	
	
}
