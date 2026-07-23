package esercizio5;

public class TestGara {

	public static void main(String[] args) {
		
		Pilota[] lista = new Pilota[5];
		
		lista[0]= new Pilota("Mario", "auto1", "scuderia1");
		lista[1]= new Pilota("Luigi", "auto2", "scuderia2");
		lista[2]= new Pilota("Paolo", "auto3", "scuderia3");
		lista[3]= new Pilota("Michele", "auto4", "scuderia4");
		lista[4]= new Pilota("Luca", "auto5", "scuderia5");
		
		Gara gara1 = new Gara("prima gara", lista);
		
		gara1.stampaPiloti();
		gara1.creaGrigliaDiPartenza();
		gara1.stampaGrigliaDiPartenza();
		
		gara1.corriGara();
		
		/*
		Pilota[] lista1 = new Pilota[10];
		
		lista1[0]= new Pilota("Mario", "auto1", "scuderia1");
		lista1[1]= new Pilota("Luigi", "auto2", "scuderia2");
		lista1[2]= new Pilota("Paolo", "auto3", "scuderia3");
		lista1[3]= new Pilota("Michele", "auto4", "scuderia4");
		lista1[4]= new Pilota("Luca", "auto5", "scuderia5");
		lista1[5]= new Pilota("Simone", "auto6", "scuderia6");
		lista1[6]= new Pilota("Matteo", "auto7", "scuderia7");
		lista1[7]= new Pilota("Filippo", "auto8", "scuderia8");
		lista1[8]= new Pilota("Giulio", "auto9", "scuderia9");
		lista1[9]= new Pilota("Biagio", "auto10", "scuderia10");
		
		Gara gara2 = new Gara("seconda gara", lista1);
		
		gara2.stampaPiloti();
		gara2.creaGrigliaDiPartenza();
		gara2.stampaGrigliaDiPartenza();
		
		gara2.corriGara();
		*/
		
	}

}
