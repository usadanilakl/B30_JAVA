package day41_Generics;

public class GenericMethods {
    public static <T> void printEach(T[] t){
        for(T each : t){
            System.out.print(each + " ");
        }
    }

    public static void main(String[] args) {
        String [] strArr = {"Hello", "Good bye", "How are you"};
        Integer[] intArr = {11,234,742,333};

        printEach(strArr);
        System.out.println();
        printEach(intArr);
    }
}
