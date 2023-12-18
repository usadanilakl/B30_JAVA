package day19_Arrays;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] numbers1 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] numbers2 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] numbers3 = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][][] allNumbers = {numbers1, numbers2, numbers3};

        System.out.println(allNumbers[0][0][0]);
        System.out.println(allNumbers[1][1][1]);
        System.out.println(allNumbers[2][2][2]);

        System.out.println(Arrays.toString(allNumbers[0][1]));
        System.out.println(Arrays.deepToString(allNumbers[2]));
    }
}
