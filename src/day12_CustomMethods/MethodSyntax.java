package day12_CustomMethods;

public class MethodSyntax {
    public static void doSum(int x, int y){
        System.out.println("Here is your sum: "+(x+y));
    }

    public static int getSum(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        doSum(5,5);
        System.out.println(getSum(6,6));
    }
}
