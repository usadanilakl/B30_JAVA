package day34_Exceptions;

public class Throw {
    public static void main(String[] args) {
        String str = "hello";
        if(!Character.isUpperCase(str.charAt(0))){
            throw new RuntimeException("The word must start with upper case character ->" + str);
        }

        System.out.println(str);
    }
}
