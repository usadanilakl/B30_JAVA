package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(1234,1651,13244661,1,145,3,425,4516));
        System.out.println(Collections.max(one));
        System.out.println(Collections.min(one));

        Collections.sort(one);
        System.out.println(one);

        Collections.shuffle(one);
        System.out.println(one);

        System.out.println(Collections.frequency(one, 1));

        Collections.replaceAll(one, 1, 111);
        System.out.println(one);

        Collections.sort(one);
        Collections.reverse(one);
        System.out.println(one);


    }
}
