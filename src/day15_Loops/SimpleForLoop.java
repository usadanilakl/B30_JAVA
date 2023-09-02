package day15_Loops;

public class SimpleForLoop {
    public static void main(String[] args) {
        String s = "My String here";
        String sr = "";

        for(int i = s.length()-1; i>-1; i--){
            sr+=s.charAt(i);
        }
        System.out.println(sr);


    }

}
