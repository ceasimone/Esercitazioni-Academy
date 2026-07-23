package medioevo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" ");
		Cavaliere c1= new Cavaliere("Mario", "Lancia", "Zucutella");
		System.out.println(c1);
		c1.avaza();
		c1.combatti();
		c1.riposa();
		c1.gridoDiBattaglia();
		
		System.out.println("\n\n-------------------\n\n");
		
		Fante f1= new Fante("Massimo Decimo Meridio", "Gladio", 9.0);
		System.out.println(f1);
		f1.avaza();
		f1.combatti();
		f1.riposa();
		f1.gridoDiBattaglia();
		
		Object obj ="ciao";
		obj=5;
		obj=true;
		
		if( obj instanceof String) {
			System.out.println(obj);
		}else {
			System.out.println(obj);
		}
		
	}

}
