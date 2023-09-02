package day19_Arrays;

import java.util.Arrays;

public class MutabilityOfArrays {
    public static void main(String[] args) {

        String[] words = {"One", "Two","Three"};
        String[] str = words;
        str[0] = "null";
        System.out.println(Arrays.toString(words));
        System.out.println("___________________________");

        String[] one = {"Hello", "Hi","Alloha"};
        String[] two = {"Hello", "Hi","Alloha"};
        one[0] = "Bye";
        System.out.println(Arrays.toString(two));
        System.out.println("___________________________");


        String[] three = {"Hello", "Hi","Alloha"};
        String[] four = Arrays.copyOf(three, 3);
        three[0] = "Bye";
        System.out.println(Arrays.toString(four));
        System.out.println("___________________________");


    }
}
