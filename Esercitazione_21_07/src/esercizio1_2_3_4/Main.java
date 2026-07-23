package esercizio1_2_3_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		Scanner input= new Scanner(System.in);
		
		System.out.println("Quanti valori vuoi inserire? ");
		int valori= input.nextInt();
		int inserimento;
		
		for(int i=0; i<valori;i++) {
			System.out.println("Inserisci valore");
			inserimento=input.nextInt();
			arrayList.add(inserimento);	
		}
		
		Iterator<Integer> in = arrayList.iterator();
		
		while(in.hasNext()) {
			System.out.print(in.next() + " ");
		}
		
		System.out.println("\n");
		Set<Integer> hashSet = new HashSet<>();
		
		System.out.println("Quanti valori vuoi inserire? ");
		valori= input.nextInt();
		
		for(int i=0; i<valori;i++) {
			System.out.println("Inserisci valore, i duplicati sono accettati ma non vengono memorizzati");
			inserimento=input.nextInt();
			hashSet.add(inserimento);
		}
		
		System.out.println(hashSet);
		
		Map<Integer,String> hashMap = new HashMap<>();
		
		
		String stringa;
		
		input.nextLine();
		
		for(int j=0; j<3;j++) {
			System.out.println("Inserisci la " + (j+1) + "a stringa");
		    stringa= input.nextLine();
			hashMap.put(j, stringa);
		}
		
		System.out.println(hashMap);
		
		List<String> array1 = new ArrayList<>();
		
		System.out.println("Quante Stringhe vuoi inserire? ");
		valori= input.nextInt();
		
		input.nextLine();
		
		for(int i=0; i<valori;i++) {
			System.out.println("Inserisci la " + (i+1) + "a stringa");
			stringa= input.nextLine();
			array1.add(stringa);	
		}
		
		array1.forEach(n -> System.out.println(n));
		
		input.close();
		
	}

}
