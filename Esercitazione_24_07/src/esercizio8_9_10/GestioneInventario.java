package esercizio8_9_10;

import java.util.ArrayList;
import java.util.List;

public class GestioneInventario {
	private List<Dispositivo> lista = new ArrayList<>();
	

	public GestioneInventario() {
		super();
	}

	public GestioneInventario(List<Dispositivo> lista) {
		super();
		this.lista = lista;
	}
	
	public List<Dispositivo> getLista() {
		return lista;
	}

	public void setLista(List<Dispositivo> lista) {
		this.lista = lista;
	}

	public void aggiungiInventario(Dispositivo d) {
		lista.add(d);
	}
	
	public void rimuoviInventario(Dispositivo d) {
		lista.remove(d);
	}
	
	public void stampaInventario() {
		System.out.println("INVENTARIO DISPOSITIVI:");
		lista.forEach(i-> System.out.println(i));	
		System.out.println();
		}
	
}
