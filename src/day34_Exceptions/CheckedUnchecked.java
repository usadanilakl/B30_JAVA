package day34_Exceptions;

public class CheckedUnchecked {
    public static void main(String[] args) {
        String str = "Hello";

        try{
            str.charAt(9); // this is unchecked exception - happens during runtime
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        try{
            Thread.sleep(1000); // this is checked exception - compiler finds it before running
        } catch (Throwable e){
            e.printStackTrace();
        }

        System.out.println(str);
    }
}
