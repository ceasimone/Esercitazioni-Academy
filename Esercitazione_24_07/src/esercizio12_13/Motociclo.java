package esercizio12_13;

public class Motociclo extends Veicolo {

    private int cilindrata;

    public Motociclo(String modello, String targa, int annoImmatricolazione,
                     double costoGiornaliero, int cilindrata) {

        super(modello, targa, annoImmatricolazione, costoGiornaliero);
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCilindrata: " + cilindrata + " cc";
    }
}
