package esercizio3;

public class Main {

	public static void main(String[] args) {
		
		Viaggio v1= new Viaggio();
		v1.nome="Milano";
		v1.costo=24.5;
		v1.durata=2;
		Viaggio v2= new Viaggio();
		v2.nome="Londra";
		v2.costo=47.0;
		v2.durata=4;
		
		v1.confrontoCosto(v2.nome,v2.costo);
		v1.confrontoDurata(v2);
		v2.confrontoDurata(v1);
		
		Viaggio v3= new Viaggio("Barcellona", 6, 120.50);
		v3.informazioni();
		v3.costoOrario();
	}

}
