package day08_Ternary;

public class MultibranchTernary {
    public static void main(String[] args) {
        int x = 4, y =15;

        x = y/3 == x++ ? x+1 : y/3 == x++ ? x+20 : 0;
        //    false  |  skip |   false  | execute |skip
        System.out.println(x + "and" + y);
    }
}
