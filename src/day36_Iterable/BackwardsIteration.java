package day36_Iterable;

import java.util.*;

public class BackwardsIteration {
    public static void main(String[] args) {
        LinkedList<String> n = new LinkedList<>(Arrays.asList("Danil", "Dana", "Didi", "Dante"));
        LinkedList<String> n2 = new LinkedList<>();
        ListIterator<String> it = n.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        while(it.hasPrevious()){
            String temp = it.previous();
            System.out.println(temp);
            n2.add(temp);
        }
        System.out.println("n2 = " + n2);
        System.out.println("-----------------------------------------");
        LinkedList<String> hi = new LinkedList<>(Arrays.asList("hello", "privet", "hola", "salut"));
        ListIterator<String> iterator = hi.listIterator(hi.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
