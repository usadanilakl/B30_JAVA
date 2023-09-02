package day10_Scanner;

import java.util.Scanner;

public class ScannerSyntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int i = input.nextInt();
        System.out.println("Enter number with decimal");
        double d = input.nextDouble();
        System.out.println("Enter a word");
        String w = input.next();
        input.nextLine(); // this is needed to absorb "enter" that was stored from the usage of above scanners
        System.out.println("Enter na sentence"); // this is the only method that can reed "enter" so you need to make sure there is no "enter" in the scanners memory
        String s = input.nextLine();
        input.close(); // close scanner to remove it from memory
    }
}
