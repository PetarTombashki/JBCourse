package Lekciq1;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = Double.parseDouble(scanner.nextLine());
        double priceM = 7.61;
        double price = m * priceM;
        double discount = 0.18 * price;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);;


    }
}
