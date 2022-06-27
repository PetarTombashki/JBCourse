package Lekciq2;

import java.util.Objects;
import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        "s3cr3t!P@ssw0rd"
        String word = scanner.nextLine();
        if (Objects.equals(word, "s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
