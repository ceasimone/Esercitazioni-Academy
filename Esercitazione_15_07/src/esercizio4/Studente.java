package esercizio4;

public class Studente {
	private String nome;
	private String cognome;
	private double isee;
	private int annoCorso;
	
	public Studente() {
		
	}
	
	public Studente(String nome, String cognome) {
		this.setNome(nome);
		this.setCognome(cognome);
	}
	public Studente(String nome, String cognome, double isee, int annoCorso) {
		this(nome,cognome);
		this.setIsee(isee);
		this.setAnnoCorso(annoCorso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getIsee() {
		return isee;
	}

	public void setIsee(double isee) {
		this.isee = isee;
	}

	public int getAnnoCorso() {
		return annoCorso;
	}

	public void setAnnoCorso(int annoCorso) {
		this.annoCorso = annoCorso;
	}
	
	public void calcolaTasse(Studente s) {
		int anniFuoriCorso;
		if (s instanceof Triennale) {
			Triennale t= (Triennale) s;
			if(t.isInCorso()) {
				//studente triennale in corso
				stampaTasseInCorso();
				
			}else {
				anniFuoriCorso=this.annoCorso-3;
				if(anniFuoriCorso>3) {
					anniFuoriCorso=3;
				}
				
				stampaTasseFuoriCorso(anniFuoriCorso,t.getTassa());
			}
			
		}else if(s instanceof Magistrale) {
			Magistrale m=(Magistrale) s;
			if(m.isInCorso()) {
				//studente magistrale in corso
				stampaTasseInCorso();
				
			}else {
				//studente magistrale fuori corso
				anniFuoriCorso=this.annoCorso-2;
				if(anniFuoriCorso>2) {
					anniFuoriCorso=2;
				}
				stampaTasseFuoriCorso(anniFuoriCorso, m.getTassa());
			}
		}
	}
		
		public void stampaTasseInCorso() {
			if(this.isee<=10000) {
				System.out.println("lo studente: "+ this.nome + " deve pagare: 500 euro");
			}else if(this.isee>10000 && this.isee<=30000) {
				System.out.println("lo studente: "+ this.nome + " deve pagare: 700 euro");
			}else {
				System.out.println("lo studente: "+ this.nome + " deve pagare: 1200 euro");
			}
		}
		
		private void stampaTasseFuoriCorso(int anniFuoriCorso, int tassa) {
			int tassaFinale;
			
			tassa=tassa*anniFuoriCorso;
			
			if(this.isee<=10000) {
				tassaFinale=500;
			}else if(this.isee>10000 && this.isee<=30000) {
				tassaFinale=700;
			}else {
				tassaFinale=1200;
			}
			
			tassaFinale = tassaFinale + (tassaFinale*tassa/100);
			
			System.out.println("lo studente: "+ this.nome + " deve pagare: " + tassaFinale + " euro");
		}
	
}
