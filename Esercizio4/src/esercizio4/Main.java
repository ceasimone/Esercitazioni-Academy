package esercizio4;

public class Main {

	public static void main(String[] args) {
		VideogiocoRpg vr = new VideogiocoRpg("Baldur's Gate 3", 44.99,18,100,100 );
		VideogiocoCompetitivo vc = new VideogiocoCompetitivo("Tom Clancy's Rainbow Six Siege", 8.99, 18, 1240);
		
		vr.gioca();
		vc.gioca();
		
		vc.sfida();
		
		System.out.println(vr);
		System.out.println(vc);
		
		gioca(vr);
		gioca(vc);
		

	}
	
	public static void gioca(Videogioco v) {
		v.gioca();
		}
	

}
