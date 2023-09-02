package day06_ifStatement;

public class NestedIf {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        if(x++ == 5){ // true


            if(x++ == 5){ // false
                System.out.println("one");
            } else if(x++ == 6){
                System.out.println("two");
            }else if (x++ == 8){
                System.out.println("three"); // executed
            }else{
                System.out.println("last");
            }


        }else{
            System.out.println("last");
        }

        if(y++ == 5){ // false, inner if will be skipped


            if(y++ == 5){ // this iss true, but the whole block is skipped;
                System.out.println("one");
            } else if(x++ == 6){
                System.out.println("two");
            }else if (x++ == 8){
                System.out.println("three");
            }else{
                System.out.println("last");
            }


        }else{
            System.out.println("y equals: " + y);
            System.out.println("inner if was skipped because the outer if is false"); // executed
        }

    }
}
