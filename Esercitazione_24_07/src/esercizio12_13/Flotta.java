package esercizio12_13;

import java.util.ArrayList;

public class Flotta {

    private ArrayList<Veicolo> lista = new ArrayList<>();

    public void aggiungiVeicolo(Veicolo v) {
        lista.add(v);
    }

    public void visualizzaVeicoli() {

        if (lista.isEmpty()) {
            System.out.println("Nessun veicolo presente.");
            return;
        }

        for (Veicolo v : lista) {
            System.out.println("--------------------");
            System.out.println(v);
        }
    }

    public double calcolaCosto(String modello, int giorni) {

        for (Veicolo v : lista) {

            if (v.getModello().equalsIgnoreCase(modello)) {

                if (!v.isDisponibile())
                    return -2;

                return giorni * v.getCostoGiornaliero();
            }
        }

        return -1;
    }
    
    public boolean rimuoviVeicolo(String targa) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getTarga().equalsIgnoreCase(targa)) {
                lista.remove(i);
                return true;
            }
        }

        return false;
    }
    
    public boolean noleggiaVeicolo(String modello) {

        for (Veicolo v : lista) {

            if (v.getModello().equalsIgnoreCase(modello) && v.isDisponibile()) {
                v.setDisponibile(false);
                return true;
            }
        }

        return false;
    }
    
}
