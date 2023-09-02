package day06_ifStatement;

public class ifElse {
    public static void main(String[] args) {
        int x = 4, y = 15;

        if(x*3 == y){ // not true
            System.out.println(x); // not executed
        } else {
            x++; // this executed
        }

        if(x*3 == y){ // this is true
            System.out.println("first time x = "+x); // this is executed
        } else {
            x++; // this is not executed
        }

        System.out.println("second time x = "+x);

    }
}
