package day34_Exceptions;

public class TrowsTryCatch {
    public static void ThrowsTest() throws InterruptedException{
        System.out.println("Hello"  );
        Thread.sleep(2000);
        System.out.println("World");
    }

    public static void TryCatchTest(){
        System.out.println("Hello"  );
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("World");
    }

    public static void main(String[] args) {
       // ThrowsTest(); // exception handled with throws keyword only works inside the method, not when it is called somewhere else in the project
        TryCatchTest(); // try catch block handles the exception permanently
    }


}
