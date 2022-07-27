package Lekciq1Upr;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  dep = Double.parseDouble(scanner.nextLine());
        int monts = Integer.parseInt(scanner.nextLine());
        double  intеrest = Double.parseDouble(scanner.nextLine());
        System.out.println(dep + monts * (dep * intеrest/100)/12);
    }
}
