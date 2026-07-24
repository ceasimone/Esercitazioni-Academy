package esercizio12_13;

public class Furgone extends Veicolo {

    private double capacitaCarico;

    public Furgone(String modello, String targa, int annoImmatricolazione,
                   double costoGiornaliero, double capacitaCarico) {

        super(modello, targa, annoImmatricolazione, costoGiornaliero);
        this.capacitaCarico = capacitaCarico;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCapacità carico: " + capacitaCarico + " kg";
    }
}
