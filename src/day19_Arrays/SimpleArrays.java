package day19_Arrays;

import java.util.Arrays;

public class SimpleArrays {
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 1;

        System.out.println(Arrays.toString(nums));

        String[] words = {"One", "Two", "Three"};
        String[] words2 = words;
        words[0] = "five"; //arrays are mutable objects

        System.out.println(Arrays.toString(words)); //if one object is referenced by 2 different variables, changing object will be reflected no matter what variable is used to access the object
        System.out.println(Arrays.toString(words2));

        System.out.println("--------------------------------------");
    }
}
