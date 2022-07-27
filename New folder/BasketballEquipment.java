package Lekciq1Upr;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = Integer.parseInt(scanner.nextLine());
//        Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double sneakers = 0.6 * fee;
        double outfit = 0.8 * sneakers;
        double ball = 0.25 * outfit;
        double accessories = 0.2 * ball;
        System.out.println(fee + sneakers + outfit + ball + accessories);;
    }
}
