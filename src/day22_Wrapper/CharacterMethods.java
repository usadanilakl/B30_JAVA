package day22_Wrapper;

public class CharacterMethods {
    public static void main(String[] args) {
        String one = "Hello 123";
        String letters = "";
        String numbers = "";

        for (int i = 0; i < one.length(); i++) {
            if(Character.isDigit(one.charAt(i)))
                numbers+=one.charAt(i);
            else letters += one.charAt(i);
        }
        System.out.println(letters);
        System.out.println(numbers);
    }
}
