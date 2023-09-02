package Day05_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5, y = 15;

        System.out.println(x*3 == y || y<x);
        System.out.println(x*3 == y && y<x);

        System.out.println("------------------------------");

        System.out.println(x*3 == y || ++x > y); // ++x is not executed because logical operator does not execute unnecessary portion.
        System.out.println(x);
        System.out.println(x*3 == y | ++x > y); // ++x is executed because binary operators run the whole line regardless.
        System.out.println(x);

        System.out.println("-------------------------------------------");

        boolean one = x*3 == y && ++x > y; // logical operator runs the first expression it is false (6*3 == 15) that means the whole expression is false and it doesn't run the rest of the line because it won't change the outcome. So ++x is not executed
        System.out.println(x);
        boolean two = x*3 == y & ++x > y; // binary operator runs the whole line regardless. ++x is executed
        System.out.println(x);

    }
}
