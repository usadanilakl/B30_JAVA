package day41_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class  GenericClassPractice <T> { // Generic class makes all methods generic
    ArrayList<T> list;
    public GenericClassPractice(){
        list = new ArrayList<>();
    }

    public void printList(){
        for(T each : list){
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericClassPractice<String> words = new GenericClassPractice<>(); // Data types must be selected when object is created
        words.list.addAll(Arrays.asList("Word", "Word2", "word3"));
        words.printList();

        GenericClassPractice<Integer> nums = new GenericClassPractice<>();
        nums.list.addAll(Arrays.asList(123,345,544,2245));
        nums.printList();
    }
}
