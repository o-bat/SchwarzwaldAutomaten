package Prüfungsaufgaben;

import java.util.Scanner;

class Ganzteil {

    public static void main(String[] args) {
        System.out.println("Ganzzajlige Division mit Rest");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Divisor:");
        int divisor = scanner.nextInt();
        System.out.println(
            "Das Ergebnis der Division ist " +
            dividend / divisor +
            " Rest: " +
            (dividend % divisor)
        );
    }
}
