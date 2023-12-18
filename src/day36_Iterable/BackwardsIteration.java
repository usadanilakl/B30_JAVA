package day36_Iterable;

import java.util.*;

public class BackwardsIteration {
    public static void main(String[] args) {
        LinkedList<String> n = new LinkedList<>(Arrays.asList("Danil", "Dana", "Didi", "Dante"));
        LinkedList<String> n2 = new LinkedList<>();
        ListIterator<String> it = n.listIterator();

        System.out.println("***********This option runs the list forward firs so when list is about to be run backwards the pointer is at the end*********");
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
        System.out.println("----------------------This option sets the pointer at the end of the list by providing index in the constructor-------------------");
        LinkedList<String> hi = new LinkedList<>(Arrays.asList("hello", "privet", "hola", "salut"));
        ListIterator<String> iterator = hi.listIterator(hi.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
