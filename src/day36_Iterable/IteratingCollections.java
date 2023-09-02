package day36_Iterable;

import java.util.*;

public class IteratingCollections {
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103,22};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(arr));
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()){
            //Integer n = it.next();
            if(it.next()%2!=0){
                it.remove();
            }
        }
        System.out.println(hashSet);
    }
}
