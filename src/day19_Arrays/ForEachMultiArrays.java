package day19_Arrays;

import java.util.Arrays;

public class ForEachMultiArrays {
    public static void main(String[] args) {
        int [] one = {1,2,4}, two = {3,4,5,6}, three = {7,8,9,10,11};
        int twoD[][] = {one,two,three};

        for(int[] n : twoD){
            for(int num : n){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        String[][] wordArrays = {  {"Hello", "Privet", "Holla"}, {"Buy", "Poka", "Adios"}, {"How are you", "Kak Dela"}  };
        for(String[] w : wordArrays) System.out.println(Arrays.toString(w));

        System.out.println(Arrays.deepToString(wordArrays));

    }
}
