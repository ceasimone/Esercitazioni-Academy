package esercizio1;

public class Main {

	public static void main(String[] args) {
		System.out.println(stampa("Mario"));
		System.out.println(stampa(18));
		System.out.println(stampa(18, " anni"));
	}
	
	public static String stampa(String s) {
		return "Passi il parametro: " + s;
	}
	
	public static String stampa(int i) {
		return "Passi il parametro: " + i;
	}
	
	public static String stampa(int i,String s1) {
		return "Passi il parametro: " + i + "Passi il secondo parametro: " + s1;
	}
}
