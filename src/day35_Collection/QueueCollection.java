package day35_Collection;

import java.util.*;

public class QueueCollection {
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};

        // no index, duplicates are allowed, First In First Out order (FIFO)

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(arr)); // Random order
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(arr)); // maintains insertion order

    }
}
