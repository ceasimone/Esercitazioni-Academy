package esercizio1;

public class Cellulare {
	private String proprietario;
	private String telefono;
	private double credito;
	
	private String[] chiamate;
	
	public Cellulare() {
		this.chiamate= new String[5];
	}
	
	public Cellulare(String proprietario, String telefono) {
		this.setProprietario(proprietario);
		this.setTelefono(telefono);
		this.credito=0.0;
		this.chiamate= new String[5];
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public void chiama(String numeroChiamato) {
		if(getCredito()>0) {
		System.out.println("Sto chiamando il numero: "+ numeroChiamato);
		listaChiamate(numeroChiamato);
		this.credito -= 1.0;
		}else {
			System.out.println("credito insufficiente");
		}
	}
	
	public void creditoResiduo() {
		System.out.println("Il credito residuo è: " + getCredito());
	}
	
	public String ultimaChiamataEffettuata() {
		return ultimoNumero();
	}
	
	public void richiama() {
		chiama(ultimoNumero());
	}
	
	public void ricaricaCredito(double credito) {
		this.credito += credito;
	}
	
	private void listaChiamate(String ultimoNumero) {
		boolean flag=false;
		for(int i=0; i<chiamate.length;i++) {
			if(chiamate[i]==null) {
				chiamate[i]=ultimoNumero;
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			spostamento(chiamate,ultimoNumero);
		}
	}
	
	public void stampaChiamate() {
		System.out.println("\n----------\nChiamate");
		for(int i=0; i<chiamate.length;i++) {
			System.out.println("Numero: "+ chiamate[i]);
		}
		System.out.println("\n----------\n");
	}
	
	private void spostamento(String[] rubrica, String ultimoNumero) {
		String temp;
		for (int i=0; i<(rubrica.length -1);i++) {
			temp=rubrica[i+1];
			rubrica[i]=temp;
			
		}
		rubrica[4]=ultimoNumero;
	}
	
	private String ultimoNumero() {
		String temp = null;
		for(int i=(chiamate.length-1);i>=0;i--) {
			if(chiamate[i]!=null) {
				temp = chiamate[i];
				break;
			}
		}
		return temp;
		
	}

	
}
