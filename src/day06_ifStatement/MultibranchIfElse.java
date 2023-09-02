package day06_ifStatement;

public class MultibranchIfElse {
    public static void main(String[] args) {
        int x = 3, y = 15;

        if(x++*3 == y){ // false
            System.out.println("first branch"); // skipped
        } else if(x++*3 == y){ // false
            System.out.println("second branch"); //skipped
        } else if(x++*3 == y){ // true
            System.out.println("third branch"); // printed
        }else{
            System.out.println("last branch"); // skipped
        }

        System.out.println("-----------------------------------------");

        if(x++*3 == y+3){ // true
            System.out.println("first branch"); // printed
        } else if(x++*3 == y){ // false
            System.out.println("second branch"); //skipped
        } else if(x++*3 == y){ // true
            System.out.println("third branch"); // skipped
        }else{
            System.out.println("last branch"); // skipped
        }
    }
}
