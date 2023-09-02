package day37_MultiThread;

public class MultiThredImplements implements Runnable{
    public String num;
    public MultiThredImplements(String num){
        this.num = num;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + num + " Says: Hello!!!");
        }
    }

    public static void main(String[] args) {
        MultiThredImplements one = new MultiThredImplements("one");
        MultiThredImplements two = new MultiThredImplements("two");
        MultiThredImplements three = new MultiThredImplements("three");
        MultiThredImplements four = new MultiThredImplements("four");

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);
        Thread t3 = new Thread(three);
        Thread t4 = new Thread(four);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        new Thread(new MultiThredImplements("SPECIAL ONE!!!")).start();


    }
}
