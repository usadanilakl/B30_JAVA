package day35_Collection.practice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    public static void main(String[] args) {
        Integer arr[] = {123,5,33,255,7745,3,1,66,3,222,316,980};
        LinkedList<Integer> linkedList = new LinkedList<>();
        Queue<Integer> queueList = new LinkedList<>();
        Deque<Integer> dequeList = new LinkedList<>();

        for (Integer integer : arr) {
            linkedList.add(integer);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(linkedList.poll() + ", ");
        }
        System.out.println("Linked List add");

        for (Integer integer : arr) {
            linkedList.push(integer);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(linkedList.pop() + ", ");
        }
        System.out.println("Linked List push");

        System.out.println("----------------------QList---------------------------");
        for (Integer integer : arr) {
            queueList.add(integer);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(queueList.poll() + ", ");
        }
        System.out.println("Q List add");
        // queue doesn't have push or pop methods;

        System.out.println("----------------------DQList---------------------------");
        for (Integer integer : arr) {
            dequeList.add(integer);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(dequeList.poll() + ", ");
        }
        System.out.println("DQ List add");

        for (Integer integer : arr) {
            dequeList.push(integer);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(dequeList.pop() + ", ");
        }
        System.out.println("DQ List push");
    }
}
