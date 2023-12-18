package day35_Collection;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));



//        LinkedList<String> linkedWords = new LinkedList<>();
//        for (String word : words) {
//            linkedWords.push(word);
//        }
//
//        while (linkedWords.size()>0) {
//            System.out.println("linkedWords.pop() = " + linkedWords.poll());
//        }

//        Queue<String> queueWords = new ArrayDeque<>();
//        for (String word : words) {
//            queueWords.add(word);
//        }
//
//
//
//        while (queueWords.size()>0){
//            System.out.println("queueWords.poll() = " + queueWords.poll());
//        }

        Deque<String> queueWords = new ArrayDeque<>();
        for (String word : words) {
            queueWords.add(word);
        }

        System.out.println("queueWords.getFirst() = " + queueWords.getFirst());
        System.out.println("queueWords.getLast() = " + queueWords.getLast());

        while (queueWords.size()>0){
            System.out.println("queueWords.poll() = " + queueWords.pollLast());
        }
    }
}
