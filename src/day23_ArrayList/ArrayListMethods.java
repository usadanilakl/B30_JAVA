package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> two = new ArrayList<>(Arrays.asList(1,2,56,123,236,1342123,734,236236));
        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(1,2,56,123,236,1342123,734,236236));
        one.add(1,17);
        one.add(1,17);
        one.add(1,17);
        System.out.println(one);

        one.remove(Integer.valueOf(17));
        one.remove(7);
        System.out.println(one);

        one.removeAll(Arrays.asList(17,2));
        System.out.println(one);

        one.forEach(p-> System.out.println(p));
        one.forEach(p-> two.add(4,p));
        System.out.println(two);

        ArrayList<Integer> three = (ArrayList<Integer>) one.clone();
        System.out.println(three);
        three.add(0,555);
        System.out.println(three);
        System.out.println(one);

        ArrayList<Integer> four = new ArrayList<>(one.subList(0,4));
        System.out.println(four);

        System.out.println(one.indexOf(123));

        Integer [] arr = one.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println(one.contains(123));


    }


}
