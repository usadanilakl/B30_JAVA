package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDeclaration_Initialization {
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("Privet");
        listStr.add("Holla");

        System.out.println(listStr);

        listStr.addAll(Arrays.asList("Goodby", "Poka", "Adios"));

        System.out.println(listStr);

        ArrayList<String> someWords = new ArrayList<>(Arrays.asList("How are you", "Welcome", "You are awesome"));
        listStr.addAll(someWords);

        System.out.println(listStr);


    }
}
