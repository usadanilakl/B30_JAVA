package day34_Exceptions;

public class TwoExceptions {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7};
        try {
            System.out.println("one");
            Thread.sleep(3000);
            System.out.println("two");
            //arr[8] = 12;
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            System.out.println("three");
            Thread.sleep(3000);
            System.out.println("four");
            arr[8] = 12;
            arr[12] = 8;
        }catch (InterruptedException | IndexOutOfBoundsException e){
            e.printStackTrace();

        }
    }
}
