package day35_Collection.treeStructure;

import java.util.*;

public class LinkedListPractice {
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};
        Deque<Integer> linkedList = new LinkedList<>(); // maintains insertion order, FIFO extraction order

        for(Integer e : arr){
            linkedList.add(e);
        }
        while (!linkedList.isEmpty()){
            System.out.print(linkedList.pop()+", ");
        }
        System.out.println();
        System.out.println();

        for(Integer e : arr){
            linkedList.push(e);
        }
        while (!linkedList.isEmpty()){
            System.out.print(linkedList.poll()+", ");
        }
        System.out.println();
        System.out.println();
    }
}
