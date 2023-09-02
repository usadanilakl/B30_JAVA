package day19_Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] one = {1,3,5,7,9};
        int[] two = {2,4,6,8};
        System.out.println(Arrays.compare(one, two));
        int[] copyOne = Arrays.copyOf(one, 5);
        System.out.println(Arrays.equals(one, copyOne));
        for (int i = 0; i < two.length; i++) {
            Arrays.fill(two, i,i+1,i*6);
        }
        System.out.println(Arrays.toString(two));


        String[] words = new String[60];
        Random r = new Random();

        for(int i = 0; i < words.length;  i++   ){
            String rStr = "";
            while(rStr.length()<7) {
                int w = r.nextInt(120);
                if(w>60){
                    rStr+= (char)w;
                }
            }
            words[i] = rStr;
        }
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}
