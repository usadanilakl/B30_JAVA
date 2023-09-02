package day35_Collection;

import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {

        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};

        Collection<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(arr));
        Collection<Integer> priorityQueue2 = new PriorityQueue<>(Arrays.asList(arr));

        priorityQueue.size();
        priorityQueue.add(777);
        priorityQueue.clear();
        priorityQueue.addAll(Arrays.asList(arr));
        priorityQueue.contains(777);
        priorityQueue.equals(priorityQueue2);
        priorityQueue.containsAll(Arrays.asList(77,777));
        priorityQueue.isEmpty();
        priorityQueue.removeAll(Arrays.asList(77,777));
        priorityQueue.removeIf(p->p==77);
        Integer[] newArr = (Integer[]) priorityQueue.toArray();


    }
}
