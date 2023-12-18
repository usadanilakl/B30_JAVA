package day35_Collection;

import java.util.*;

public class ComparatorPractice implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        String one = o1.substring(o1.length() - 1);
        String two = o2.substring(o2.length() - 1);
        return one.compareTo(two);
    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

        Collections.sort(words, new ComparatorPractice());
        System.out.println(words);
    }
}
