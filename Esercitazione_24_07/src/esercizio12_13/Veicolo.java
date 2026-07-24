package esercizio12_13;

public class Veicolo {
	 private String modello;
	    private String targa;
	    private int annoImmatricolazione;
	    private double costoGiornaliero;

	    private boolean disponibile;

	    public Veicolo(String modello, String targa, int annoImmatricolazione, double costoGiornaliero) {
	        this.modello = modello;
	        this.targa = targa;
	        this.annoImmatricolazione = annoImmatricolazione;
	        this.costoGiornaliero = costoGiornaliero;
	        this.setDisponibile(true);
	    }

	    public String getModello() {
	        return modello;
	    }

	    public String getTarga() {
	        return targa;
	    }

	    public int getAnnoImmatricolazione() {
	        return annoImmatricolazione;
	    }

	    public double getCostoGiornaliero() {
	        return costoGiornaliero;
	    }
	    

	    public boolean isDisponibile() {
			return disponibile;
		}

		public void setDisponibile(boolean disponibile) {
			this.disponibile = disponibile;
		}

		@Override
	    public String toString() {
	        return "Modello: " + modello +
	                "\nTarga: " + targa +
	                "\nAnno: " + annoImmatricolazione +
	                "\nCosto giornaliero: " + costoGiornaliero +
	                "\nDisponibile: " + disponibile;
	    }
}
