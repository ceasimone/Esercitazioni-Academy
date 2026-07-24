package esercizio7;

public class Main {

	public static void main(String[] args){
		try {
			Box b1 = new Box(2.0,3.0,6.0);
			Box b2 = new Box(1.0,2.0,4.0);
			Box b3 = new Box(2.0,3.0,6.0);
			
			System.out.println(b1.isContenuto(b2));
			System.out.println(b1.isContenuto(b3));
			System.out.println(b2.isContenuto(b1));
			System.out.println(b2.isContenuto(b3));
			
			System.out.println(b1.equals(b2));
			System.out.println(b1.equals(b3));
			
		}catch(UndiscoveredDimensionException e) {
			
		}
		
	}

}
