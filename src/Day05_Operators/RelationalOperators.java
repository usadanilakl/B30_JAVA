package Day05_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //All relational operators return a boolean value

        int x = 5, y = 15;

        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x*3 == y);

        System.out.println("------------------------");

        System.out.println(!(x>y));

    }
}
