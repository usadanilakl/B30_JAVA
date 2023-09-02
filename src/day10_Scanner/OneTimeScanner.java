package day10_Scanner;

import java.util.Scanner;

public class OneTimeScanner {
    public static void main(String[] args) {
        System.out.println("You entered: " + new Scanner(System.in).nextLine());
        // this is unreferenced scanner, it does not have to be closed

    }
}
