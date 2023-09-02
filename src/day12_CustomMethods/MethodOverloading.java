package day12_CustomMethods;

public class MethodOverloading {
    public static void sumSum(int i, int b){
        System.out.println(i+b);
    }
    public static void sumSum(double i, double b){
        System.out.println(i+b);
    }
    public static double sumSum(double i, int b) {
        return i + b;
    }
    public static void sumSum(String i, String b){
        System.out.println(i+b);
    }

    public static void main(String[] args) {
        sumSum(5,5);
        sumSum(5.5,5.0);
        sumSum("Hello ", "World");
        System.out.println("----------------------------------");
        sumSum((int)sumSum(5.5,6), (int)sumSum(3.3, 6)); // user return value from method as argument

    }
}
