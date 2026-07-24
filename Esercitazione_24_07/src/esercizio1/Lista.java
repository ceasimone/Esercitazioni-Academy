package esercizio1;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private static List<Double> lista = new ArrayList<>();
	private double media;
	private double max;
	
	public void inserisci(Double d) {
		lista.add(d);
		media();
		cercaMax();
	}
	
	public void stampaLista() {
		System.out.print("Lista: ");
		lista.forEach(n-> System.out.print(n + " "));
		
		System.out.println();
		
		System.out.println("Media: "+getMedia());
		System.out.println("Massimo: " +getMax());
	}
	
	private void media() {
		double somma=0.0;
		for(int i=0; i<lista.size();i++)
			somma +=lista.get(i);
		setMedia((somma/lista.size()));
	}

	private void setMedia(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}
	
	private void cercaMax() {
		double max= lista.getFirst();
		for(int i=1; i<lista.size();i++) {
			if (max<lista.get(i)) {
				max=lista.get(i);
			}
		}
		setMax(max);
	}

	public double getMax() {
		return max;
	}

	private void setMax(double max) {
		this.max = max;
	}
	
	
	
}
