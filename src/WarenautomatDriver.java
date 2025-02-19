
import java.util.Scanner;

public class WarenautomatDriver {

    public static void main(String[] args) {

        double bezahlung;

        Scanner scan = new Scanner(System.in);

        String[] artikel = new String[6];

        artikel[0] = "Cola";
        artikel[1] = "Fanta";
        artikel[2] = "Red Bull";
        artikel[3] = "Spezi";
        artikel[4] = "Snickers";
        artikel[5] = "Twix";

        double[] preis = new double[6];

        preis[0] = 1.50;
        preis[1] = 1.50;
        preis[2] = 1.50;
        preis[3] = 1.50;
        preis[4] = 1.50;
        preis[5] = 1.50;

        System.out.println("Welcome to Schwarzwaldautomaten");
        System.out.println("| Cola  | Fanta | Snickers |");
        System.out.println("| 1,50€ | 1,50€ |   3,00€  |");
        System.out.println("|   1   |   2   |     3    |");
        System.out.println("-----------------------------");

        System.out.println();
        System.out.println("Wählen Sie ein Artikel Nummer:");
        short artikelNummer = scan.nextShort();

        switch (artikelNummer) {
            case 1:
                System.out.println("Gewählte Atikel Nr. 1 Cola : 1,50€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < 1.50) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");
                } else {
                    if (bezahlung == 1.50) {

                        System.out.println("Willst du Vorgang wiederholen (ja/nein)");
                        String input = scan.nextLine();
                        if ("ja".equalsIgnoreCase(input)) {
                            main(args); // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }

                    } else {
                        if (bezahlung > 1.50) {
                            System.out.println("Hier ist Wechselgeld " + (bezahlung - 1.50) + "€");

                            System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                            String input = scan.next();

                            if ("ja".equalsIgnoreCase(input)) {
                                main(args); // Restart the program
                            } else {
                                System.out.println("Auf Wiedersehen!");
                            }

                        }
                    }
                }
                break;
            case 2:
                System.out.println("Gewählte Atikel Nr. 2 Fanta : 1,50€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < 1.50) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");
                } else {
                    if (bezahlung == 1.50) {

                        System.out.println("Willst du Vorgang wiederholen (ja/nein)");
                        String input = scan.nextLine();
                        if ("ja".equalsIgnoreCase(input)) {
                            main(args); // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }

                    } else {
                        if (bezahlung > 1.50) {
                            System.out.println("Hier ist Wechselgeld " + (bezahlung - 1.50) + "€");

                            System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                            String input = scan.next();

                            if ("ja".equalsIgnoreCase(input)) {
                                main(args); // Restart the program
                            } else {
                                System.out.println("Auf Wiedersehen!");
                            }

                        }
                    }
                }

                break;
            case 3:
                System.out.println("Gewählte Atikel Nr. 3 Snickers : 3,00€");
                System.out.println("Bitte bezahlen sie den Artikelpreis: ");
                bezahlung = scan.nextDouble();
                if (bezahlung < 3.00) {
                    System.out.println("Zu wenig bezahlt " + bezahlung + "€");
                } else {
                    if (bezahlung == 3.00) {

                        System.out.println("Willst du Vorgang wiederholen (ja/nein)");
                        String input = scan.nextLine();
                        if ("ja".equalsIgnoreCase(input)) {
                            main(args); // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }

                    } else {
                        if (bezahlung > 3.00) {
                            System.out.println("Hier ist Wechselgeld " + (bezahlung - 3.00) + "€");

                        }

                        System.out.println("Willst du Vorgang wiederholen (ja/nein)");

                        String input = scan.next();

                        if ("ja".equalsIgnoreCase(input)) {
                            main(args); // Restart the program
                        } else {
                            System.out.println("Auf Wiedersehen!");
                        }

                    }
                }
                break;
            default:
                System.out.println("Ungültige Artikel Nummer");
                break;
        }

    }
}