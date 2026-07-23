package esercizio7;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Java che stampi a schermo la somma dei numeri da 1 a 10. Utilizza sia un ciclo while, sia un ciclo for
		 */
		
		int somma=0;
		
		for(int i=1; i<=10;i++) {
			somma=somma+i;
		}
		
		System.out.println("La somma dei numeri da 1 a 10 con il ciclo for è: "+ somma);
		
		somma=0;
		int j=1;
		System.out.print("La somma dei numeri da 1 a 10 con il while è: ");
		while(j<=10) {
			somma=somma+j;
			//somma += j;
			if(j!=1) {
			System.out.print(" + " + j );
			}else {
				System.out.print( j );
			}
			j++;
		}
		System.out.println(" = "+ somma);
		
		
		
	}
	
	

}
