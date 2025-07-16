package Prüfungsaufgaben;

import java.util.Scanner;

class Benzin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Programmtitel ausgeben
        System.out.println("Berechnung des Durchschnittsverbrauchs");

        // Kraftstoffverbrauch einlesen
        System.out.print("verbrauchter Kraftstoff in l: ");
        double kraftstoff = scanner.nextDouble();

        // Gefahrene Strecke einlesen
        System.out.print("gefahrene Strecke in km: ");
        double strecke = scanner.nextDouble();

        // Berechnung des Durchschnittsverbrauchs auf 100 km
        double durchschnittsverbrauch = (kraftstoff / strecke) * 100;

        // Ausgabe des Ergebnisses
        System.out.println(
            "Der Durchschnittsverbrauch ist " +
            durchschnittsverbrauch +
            " l/100km"
        );
        System.out.println("Programmende");

        // Scanner schließen
        scanner.close();
    }
}
