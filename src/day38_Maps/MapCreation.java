package day38_Maps;

import day29_Enheritance.Child1;

import java.util.HashMap;
import java.util.Map;

public class MapCreation {
    public static void main(String[] args) {
        Map<Integer, Integer> one = new HashMap<>(Map.of(1,1,2,2,3,3,4,4));
        System.out.println(one);
        Map<Integer,Integer> two = new HashMap<>();
        two.put(1,1);
        two.put(2,2);
        two.put(3,3);
        two.put(4,4);
        System.out.println(two);
    }
}
