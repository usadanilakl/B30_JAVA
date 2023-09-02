package day39_FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static ArrayList<String> myArr = new ArrayList<>();
    public static void stringOps(String inp, Consumer<String> c){
        String [] arr = inp.split(" ");
        for(String e : arr){
            c.accept(e);
        }
    }

    public static void main(String[] args) {
        String str = "Hello I am learning functional interface and it is kind of confusing, but I am sure I will get it";
        stringOps(str, c -> {
            if(c.length()>6){
                myArr.add(c);
            }
        });

        System.out.println("myArr = " + myArr);
    }
}
