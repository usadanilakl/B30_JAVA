package day34_Exceptions;

public class FinallyMultiCatch {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            str.charAt(9);
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("this is first catch: "+e.getMessage());
        }catch (IndexOutOfBoundsException e ){
            System.out.println("this is second catch:" + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("this is third catch block: ");
            e.printStackTrace();
        }finally {
            System.out.println("Finally block is always executed, even if no exceptions happened");
        }

        System.out.println();

        str = null;
        try {
            str.charAt(1);
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("this is first catch: "+e.getMessage());
        }catch (IndexOutOfBoundsException e ){
            System.out.println("this is second catch:" + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("this is third catch block: " + e.getMessage());
        }finally {
            System.out.println("Finally block is always executed, even if no exceptions happened");
        }

    }
}
