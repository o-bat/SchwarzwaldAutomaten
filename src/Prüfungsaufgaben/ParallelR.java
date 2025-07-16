package Prüfungsaufgaben;

import java.util.Scanner;

class ParallelR {

    public static void main(String[] args) {
        System.out.println("Widerstands-parallelschaltung");
        Scanner scan = new Scanner(System.in);
        System.out.println("R1 in Ohm:");
        int r1 = scan.nextInt();
        System.out.println("R2 in Ohm:");
        int r2 = scan.nextInt();
        double r = (r1 * r2) / (r1 + r2);
        System.out.println("R in Ohm:");
        System.out.println(r);
    }
}
