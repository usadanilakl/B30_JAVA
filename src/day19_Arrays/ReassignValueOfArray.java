package day19_Arrays;

import java.util.Arrays;

public class ReassignValueOfArray {
    public static void main(String[] args) {
        String[] one = {"Hello", "Hi","Alloha"}; //unreferenced values will be lost and removed by garbage collector
        System.out.println(Arrays.toString(one)); //                   ^
        one = new String[]{"Bye","See you"}; // new value is assigned _|
        System.out.println(Arrays.toString(one));
    }
}
