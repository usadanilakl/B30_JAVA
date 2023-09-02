package day04_PrimitiveCasting;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // Implicit Casting

        byte a = 15;
        short b = a; // automatically adds short b = (short)a;
        int c = b; // automatically adds int c = (int)b;
        long d = c;
        float e = d;
        double f = e;

        // Explicit Casting

        float ee = (float)f;
        long dd = (long) ee;
        int cc = (int) dd;
        short bb = (short)cc;
        byte aa = (byte)bb;

        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("dd = " + dd);
        System.out.println("cc = " + cc);
        System.out.println("bb = " + bb);
        System.out.println("aa = " + aa);
    }

}
