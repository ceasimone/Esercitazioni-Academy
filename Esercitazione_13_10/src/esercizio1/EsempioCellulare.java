package esercizio1;

public class EsempioCellulare {

	public static void main(String[] args) {
		Cellulare c1= new Cellulare("Mario Rossi", "3331234567");
		
		c1.chiama("3345434543");
		
		c1.ricaricaCredito(2.0);
		c1.creditoResiduo();
		
		c1.chiama("3345434543");
		c1.creditoResiduo();
		
		c1.richiama();
		c1.richiama(); //credito insufficiente 
		c1.ricaricaCredito(10.0);
		
		c1.chiama("3457777777");
		c1.richiama();
		//c1.creditoResiduo();
		
		c1.stampaChiamate();
		System.out.println("L'ultima chiamata effettata è al numero: "+ c1.ultimaChiamataEffettuata());
		c1.chiama("55544433322");
		c1.chiama("11111111111");
		c1.stampaChiamate();
		System.out.println("L'ultima chiamata effettata è al numero: "+ c1.ultimaChiamataEffettuata());
		
	}

}