package day35_Collection;

import java.util.*;

public class QueueCollection {
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};

        // no index, duplicates are allowed, First In First Out order (FIFO)

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // Random order of insertion, ascending order of extraction;
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(); // maintains insertion order, FIFO and FILO extraction order
        Deque<Integer> linkedList = new LinkedList<>(); // maintains insertion order, FIFO extraction order
        Stack<Integer> stack = new Stack<>();//maintains insertion order, FILO extraction order
        for(Integer e : arr){
            priorityQueue.add(e);
            arrayDeque.push(e);
            linkedList.add(e);
            stack.push(e);
        }

        System.out.println();
        System.out.println("Priority contaier:" + priorityQueue);
        System.out.print("Priority extraction:");
        while(!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+", ");
        }


        System.out.println();
        System.out.println();
        System.out.println("Array contaier: " + arrayDeque);
        System.out.print("Array extraction poll: ");
        while(!arrayDeque.isEmpty()){
            System.out.print(arrayDeque.poll()+", ");
        }

        for(Integer e : arr){
            arrayDeque.push(e);
        }


        System.out.println();
        System.out.println();
        System.out.println("Array contaier:" + arrayDeque);
        System.out.print("Array extraction pop:");
        while(!arrayDeque.isEmpty()){
            System.out.print(arrayDeque.pop()+", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("List contaier:" + linkedList);
        System.out.print("List extraction poll: ");
        while(!linkedList.isEmpty()){
            System.out.print(linkedList.poll()+", ");
        }

        for(Integer e : arr){
            linkedList.push(e);
        }

        System.out.println();
        System.out.println();
        System.out.println("List contaier:" + linkedList);
        System.out.print("List extraction pop: ");
        while(!linkedList.isEmpty()){
            System.out.print(linkedList.pop()+", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Stack contaier:" + stack);
        System.out.print("Stack extraction:");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+", ");
        }




    }
}
