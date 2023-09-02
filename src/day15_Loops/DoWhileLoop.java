package day15_Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        do {
            System.out.println("enter a number");
            int n = in.nextInt();
            System.out.println(n % 2 == 0 ? "You entered even number" : "You entered odd number");
            System.out.println("Would you like to ener another number? ");
            answer = in.next();
        }while (answer.equals("yes"));

    }
}
