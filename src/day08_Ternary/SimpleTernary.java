package day08_Ternary;

public class SimpleTernary {
    public static void main(String[] args) {
        int x = 4, y = 15;

        y = (x++*3 == y)? 30 : 15; // condition is false that means y=15
        System.out.println(x + " and " + y);
        y = (x++*3 == y)? 30 : 15;
        System.out.println(x + " and " + y); // condtion is true that means y=30;
    }
}
