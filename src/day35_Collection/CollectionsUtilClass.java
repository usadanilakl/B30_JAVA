package day35_Collection;

import java.util.*;

public class CollectionsUtilClass   {
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(arr));
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        Collections.reverse(arrList);
        Collections.replaceAll(arrList,77, 33);
        Collections.frequency(hashSet,77);
        Collections.sort(arrList);
        Collections.copy(list2,arrList);
        System.out.println(list2);
        Collections.asLifoQueue(arrayDeque);
        Collections.shuffle(list2);
        System.out.println("Collections.indexOfSubList(list2, Arrays.asList(33,33)) = " + Collections.indexOfSubList(list2, Arrays.asList(33, 33)));
        Collections.lastIndexOfSubList(list2,Arrays.asList(33, 33));
        Collections.max(list2);
        Collections.min(list2);

    }
}
