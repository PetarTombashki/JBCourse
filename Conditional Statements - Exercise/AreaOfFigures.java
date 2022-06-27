package Lekciq2;

import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;
        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            area = r * r * Math.PI;
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = a * h/2;
        }
        System.out.printf("%.3f", area);;
    }
}