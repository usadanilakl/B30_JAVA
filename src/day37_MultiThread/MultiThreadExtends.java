package day37_MultiThread;

public class MultiThreadExtends extends Thread{
    public String num;
    public int amount;
    public int count;
    public int balans;
    {balans = 0;}
    public MultiThreadExtends(String num, int amount, int count){
        this.amount = amount;
        this.count = count;
        this.num = num;
    }
    public static int bankAccount = 100000;


    public void run(){
        for (int i = 0; i < count; i++) {
            bankAccount-=amount;
            balans+=amount;
            System.out.println(num + " has " + balans + " dollars");
            if(bankAccount<1){
                throw new RuntimeException("Account is empty!!!");
            }
        }

    }

    public static void main(String[] args) {
        MultiThreadExtends one = new MultiThreadExtends("One", 100, 1000);
        MultiThreadExtends two = new MultiThreadExtends("Two", 100, 1000);
        MultiThreadExtends three = new MultiThreadExtends("Three", 100, 1000);
        MultiThreadExtends four = new MultiThreadExtends("Four", 100, 1000);
        MultiThreadExtends five = new MultiThreadExtends("Five", 100, 1000);
        MultiThreadExtends six = new MultiThreadExtends("Six", 100, 1000);

        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();


    }
}
