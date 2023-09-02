package day08_Ternary;

public class NestedTernary {
    public static void main(String[] args) {
        int x = 5, y = 15;

        y = x++==5 ? // true

                x--==5 ? 30 // false, skipp
                        : x == 5 ? 45 // true execute
                        : x == 5 ? 60 // true skipp
                        : 75 // skipp

                :90; //skipp

        System.out.println(y);
        System.out.println("----------------------------------------");

        y = ++x==5 ? // false, the internal ternary is skipped

                x--==5 ? 30
                        : x == 5 ? 45
                        : x == 5 ? 60
                        : 75

                :90; //execute

        System.out.println(y);
        System.out.println("----------------------------------------");
    }
}
