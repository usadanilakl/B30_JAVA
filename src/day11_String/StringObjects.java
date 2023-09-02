package day11_String;

public class StringObjects {
    public static void main(String[] args) {
        String one = "hello"; // in the string pool
        String two = new String("hello"); // independent object in the heap
        String three = "hello"; // same object from the string pool that is represented by "one" and "three"

        System.out.println(one==two);
        System.out.println(one==three);//checks if it is the same object
        System.out.println(one.equals(two)); // compares values of string objects
    }
}
