package day99_Extras;

import java.lang.reflect.Array;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello everybody, lets code";
        String revStrBuild = new StringBuilder(str).reverse().toString();
        String revStream = new ArrayList<>(Arrays.asList(str.split("")))
                .stream()
                .reduce((s1, s2) -> s2+s1)
                .toString();

        String revStack = "";
        Deque<String> stack = new ArrayDeque<>();
        for(String s : str.split("")){
            stack.push(s);
        }
        for(String s : stack){
            revStack += s;
        }

        String revListIterator = "";
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        ListIterator<String> ir = list.listIterator();
        while (ir.hasPrevious()){
            String el = ir.previous();
            revListIterator += el;
        }

        System.out.println("revStrBuild = " + revStrBuild);
        System.out.println("revStream = " + revStream);
        System.out.println("revStack = " + revStack);
        System.out.println("revListIterator = " + revListIterator);
    }
}
