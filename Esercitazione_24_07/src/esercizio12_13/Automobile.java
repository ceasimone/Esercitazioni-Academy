package esercizio12_13;

public class Automobile extends Veicolo {

    private int numeroPosti;

    public Automobile(String modello, String targa, int annoImmatricolazione,
                       double costoGiornaliero, int numeroPosti) {

        super(modello, targa, annoImmatricolazione, costoGiornaliero);
        this.numeroPosti = numeroPosti;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumero posti: " + numeroPosti;
    }
}
