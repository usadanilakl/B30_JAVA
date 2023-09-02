package day04_PrimitiveCasting;

public class MathOperators {

    public static void main(String[] args) {
        //division operator

        //division does not allow 0 as denominator;

        int n = 20;
        int b = 6;
        int c = n/b; // returns 3 because int doesn't support decimals;
        double d = n/b; //returns 3.0 because n and b are int;
        double e = (double)n/(double)b; // returns 3.33333 because ints were cast to double.
        double f = (double)n/b; // returns 3.3333 either numerator or denominator being double is enough;
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // remainder: numerator-(denominator*integer result)

        int nn = 20%6; // returns 2 (20-6*3)

        double nm = 20-6*3; // returns 2
        System.out.println("nm = " + nm);

        double mn = (20-6)*3; // returs 42
        System.out.println("mn = " + mn);



    }
}
