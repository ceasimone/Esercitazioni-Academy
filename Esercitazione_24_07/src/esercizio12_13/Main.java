package esercizio12_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Flotta flotta = new Flotta();

        int scelta;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1) Aggiungi Automobile");
            System.out.println("2) Aggiungi Furgone");
            System.out.println("3) Aggiungi Motociclo");
            System.out.println("4) Visualizza veicoli");
            System.out.println("5) Calcola costo noleggio");
            System.out.println("6) Noleggia veicolo");
            System.out.println("7) Rimuovi veicolo");
            System.out.println("0) Esci");

            System.out.print("Scelta: ");
            scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {

                case 1:

                    System.out.print("Modello: ");
                    String modello = input.nextLine();

                    System.out.print("Targa: ");
                    String targa = input.nextLine();

                    System.out.print("Anno immatricolazione: ");
                    int anno = input.nextInt();

                    System.out.print("Costo giornaliero: ");
                    double costo = input.nextDouble();

                    System.out.print("Numero posti: ");
                    int posti = input.nextInt();
                    input.nextLine();

                    flotta.aggiungiVeicolo(
                            new Automobile(modello, targa, anno, costo, posti));

                    System.out.println("Automobile aggiunta.");
                    break;

                case 2:

                    System.out.print("Modello: ");
                    modello = input.nextLine();

                    System.out.print("Targa: ");
                    targa = input.nextLine();

                    System.out.print("Anno immatricolazione: ");
                    anno = input.nextInt();

                    System.out.print("Costo giornaliero: ");
                    costo = input.nextDouble();

                    System.out.print("Capacità di carico (kg): ");
                    double carico = input.nextDouble();
                    input.nextLine();

                    flotta.aggiungiVeicolo(
                            new Furgone(modello, targa, anno, costo, carico));

                    System.out.println("Furgone aggiunto.");
                    break;

                case 3:

                    System.out.print("Modello: ");
                    modello = input.nextLine();

                    System.out.print("Targa: ");
                    targa = input.nextLine();

                    System.out.print("Anno immatricolazione: ");
                    anno = input.nextInt();

                    System.out.print("Costo giornaliero: ");
                    costo = input.nextDouble();

                    System.out.print("Cilindrata: ");
                    int cilindrata = input.nextInt();
                    input.nextLine();

                    flotta.aggiungiVeicolo(
                            new Motociclo(modello, targa, anno, costo, cilindrata));

                    System.out.println("Motociclo aggiunto.");
                    break;

                case 4:

                    flotta.visualizzaVeicoli();

                    break;

                case 5:

                    System.out.print("Inserisci il modello: ");
                    modello = input.nextLine();

                    System.out.print("Numero di giorni: ");
                    int giorni = input.nextInt();
                    input.nextLine();

                    double totale = flotta.calcolaCosto(modello, giorni);

                    if (totale == -1) {
                        System.out.println("Veicolo non trovato.");
                    } else if (totale == -2) {
                        System.out.println("Il veicolo non è disponibile.");
                    } else {
                        System.out.println("Costo totale del noleggio: " + totale + " euro");
                    }

                    break;

                case 6:

                    System.out.print("Inserisci il modello da noleggiare: ");
                    modello = input.nextLine();

                    if (flotta.noleggiaVeicolo(modello)) {
                        System.out.println("Veicolo noleggiato con successo.");
                    } else {
                        System.out.println("Veicolo non trovato o già noleggiato.");
                    }

                    break;

                case 7:

                    System.out.print("Inserisci la targa del veicolo da rimuovere: ");
                    targa = input.nextLine();

                    if (flotta.rimuoviVeicolo(targa)) {
                        System.out.println("Veicolo rimosso.");
                    } else {
                        System.out.println("Veicolo non trovato.");
                    }

                    break;

                case 0:

                    System.out.println("Programma terminato.");
                    break;

                default:

                    System.out.println("Scelta non valida.");

            }

        } while (scelta != 0);

        input.close();
    }
}
