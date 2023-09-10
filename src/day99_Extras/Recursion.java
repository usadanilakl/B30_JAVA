package day99_Extras;

public class Recursion {
    public static int factorial(int n){
        if(n==0)return 1;
        else return n*factorial(n-1);
    }

    public static String reverse(String str){
        if(str.length()==1) return str;
        else return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println("factorial(3) = " + factorial(5));
        System.out.println("reverse(\"Hello\") = " + reverse("Hello"));
    }
}
