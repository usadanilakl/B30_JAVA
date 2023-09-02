package day06_ifStatement;

public class Single_if {
    public static void main(String[] args) {
        int x = 4, y = 15;

        if(x++*3 == y){ //4*3 is not equal 15 so the print statement is skipped but x is incremented afterwards;
            System.out.println(x); //x==5 here
        }

        if(x++*3 == y){ // 5*3 == 15 so it prints x, but x is incremented afterwards;
            System.out.println(x); // x == 6;
        }
    }
}
