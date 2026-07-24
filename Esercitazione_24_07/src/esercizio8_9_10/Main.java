package esercizio8_9_10;


public class Main {

	public static void main(String[] args) {
		Computer c1= new Computer();
		
		c1.setNome("asus");
		c1.setPrezzo(1400.00);
		c1.setSistemaoperativo(SistemaOperativo.WINDOWS);
		
		Computer c2= new Computer("Lenovo", 850.00 , SistemaOperativo.LINUX);
		
		Smartphone t1 = new Smartphone("Oppo", 500.00, SistemaOperativo.ANDROID);
		
		c1.inserisciPeriferica();
		c2.inserisciPeriferica();
		t1.mandaMessaggio();
		GestioneInventario g = new GestioneInventario();
		g.aggiungiInventario(c1);
		g.aggiungiInventario(c2);
		g.aggiungiInventario(t1);
		g.stampaInventario();
		g.rimuoviInventario(c2);
		g.stampaInventario();
		
		numeroSistemiOperativi(g);
		esegui(c2);
		esegui(t1);
	}
	
	public static void numeroSistemiOperativi(GestioneInventario gi) {
		int temp;
		
		for(SistemaOperativo s : SistemaOperativo.values()) {
			temp=0;
			for(int i=0; i<gi.getLista().size();i++) {
				if(gi.getLista().get(i).getSistemaoperativo().equals(s)) {
					temp ++;
				}
			}
			System.out.println("Per il sistema operativo: "+ s + " ci sono: " + temp);
		}
	}
	
	public static void esegui(Dispositivo d) {
		if(d instanceof Computer) {
			Computer c = (Computer) d;
			c.inserisciPeriferica();
		}else {
			Smartphone s = (Smartphone) d;
			s.mandaMessaggio();
		}
	}
	
	

}
