package esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Squadra {
	private String nome;
	private double capitale;
	private List<Giocatore> lista = new ArrayList<>();
	
	public Squadra() {
		super();
	}

	public Squadra(String nome, double capitale) {
		super();
		this.setNome(nome);
		this.capitale = capitale;
	}

	public Squadra(String nome, double capitale, List<Giocatore> lista) {
		this(nome,capitale);
		this.lista=lista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCapitale() {
		return capitale;
	}

	public void setCapitale(double capitale) {
		this.capitale = capitale;
	}

	public List<Giocatore> getLista() {
		return lista;
	}

	public void setLista(List<Giocatore> lista) {
		this.lista = lista;
	}
	
	public void acquistaGiocatore(Giocatore g) {
		if(this.capitale > g.getPrezzo()) {
		this.lista.add(g);
		this.capitale -= g.getPrezzo();
		}else {
			System.out.println("Manca di capitale");
		}
		
	}
	
	public void vendiGiocatore(Giocatore g) {
		if(lista.contains(g)) {
			System.out.println("il giocatore è presente nella Squadra");
			for(int i=0; i<lista.size();i++) {
				lista.remove(g);
				this.capitale += g.getPrezzo();
			}
		}else {
			System.out.println("Il giocatore non è presente nella Squadra");
		}
		
	}
	

}
