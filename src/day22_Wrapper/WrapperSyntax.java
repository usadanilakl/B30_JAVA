package day22_Wrapper;

public class WrapperSyntax {
    public static void main(String[] args) {
        int n = 10;
        Integer num = n; //auto boxing - transformation of int into Integer
        n=num; // auto unboxing - transformation of Integer into int

        String word = "500";
        int parse = Integer.parseInt(word);
        System.out.println(parse );
        Integer n2 = Integer.valueOf(word);
        System.out.println(n2);

        
    }
}
