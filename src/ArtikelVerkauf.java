import java.util.Arrays;
import java.util.Scanner;

public class ArtikelVerkauf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] artikel = {
            "Artikel 1",
            "Artikel 2",
            "Artikel 3",
            "Artikel 4",
            "Artikel 5",
            "Artikel 6",
        };
        double[] preis = { 10.99, 15.99, 7.99, 12.99, 8.99, 14.99 };

        while (true) {
            System.out.println("Bitte wählen Sie einen Artikel:");
            Arrays.stream(artikel).forEach(a ->
                System.out.println(
                    (Arrays.asList(artikel).indexOf(a) + 1) + ": " + a
                )
            );
            int artikelNummer = scan.nextInt();

            if (artikelNummer < 1 || artikelNummer > artikel.length) {
                System.out.println("Ungültige Artikel Nummer");
                continue;
            }

            double preisDesArtikels = Arrays.stream(preis)
                .skip(artikelNummer - 1)
                .findFirst()
                .orElse(-1);
            if (preisDesArtikels == -1) {
                System.out.println("Ungültiger Preis für diesen Artikel");
                continue;
            }

            System.out.println(
                "Gewählter Artikel: " +
                artikel[artikelNummer - 1] +
                " mit dem Preis von " +
                preisDesArtikels +
                "€"
            );

            System.out.println("Bitte bezahlen Sie:");
            double bezahlung = scan.nextDouble();

            if (bezahlung < preisDesArtikels) {
                System.out.println(
                    "Zu wenig gezahlt. Bitte zahlen Sie erneut."
                );
                continue;
            }

            double wechselgeld = bezahlung - preisDesArtikels;
            if (wechselgeld > 0) {
                System.out.println(
                    "Hier ist Ihr Wechselgeld: " + wechselgeld + "€"
                );
            }

            System.out.println("Willst du Vorgang wiederholen? (ja/nein)");
            String input = scan.next();
            if (!input.equalsIgnoreCase("ja")) {
                break;
            }
        }

        scan.close();
    }
}
