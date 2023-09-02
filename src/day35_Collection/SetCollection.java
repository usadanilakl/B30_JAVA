package day35_Collection;

import java.util.*;

public class SetCollection {
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};

        // sets have no duplicates

        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr)); // random order, accepts null values
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>(Arrays.asList(arr)); // maintains insertion order, accepts null values
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(arr)); // sorts elements in ascending order, null values are not accaptable

        System.out.println("hashSet = " + hashSet);
        System.out.println("linkedSet = " + linkedSet);
        System.out.println("treeSet = " + treeSet);

    }
}
