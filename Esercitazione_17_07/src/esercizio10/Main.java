package esercizio10;

public class Main {

	public static void main(String[] args) {
		
		int[] array1= {5,4,3,2,1};
		
		int[] array= new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		System.out.println(decrescente(array));
		System.out.println(decrescente(array1));
		

	}
	
	public static boolean decrescente(int[] a) {
		int temp=a[0];
		for(int i=1; i<a.length;i++) {
			if(temp<a[i]) {
				temp=a[i];
				return false;
			}
		}
		return true;
	}

}
