package Prüfungsaufgaben;

import java.lang.Math;
import java.util.Scanner;

class PunktAbstand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Bitte geben Sie die Koordinaten des ersten Punktes ein (x1, y1):"
        );
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println(
            "Bitte geben Sie die Koordinaten des zweiten Punktes ein (x2, y2):"
        );
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
        System.out.println(
            "Die Entfernung zwischen den Punkten beträgt " + distance
        );
    }
}
