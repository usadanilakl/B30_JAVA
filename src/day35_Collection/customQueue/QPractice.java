package day35_Collection.customQueue;

import day35_Collection.customStack.StackList;

public class QPractice {
    public static void main(String[] args) {
        QList<Integer> n = new QList<>();
        n.enq(10);
        n.enq(20);
        n.enq(30);
        n.enq(40);
        n.enq(50);
        n.enq(60);
        System.out.println("n = " + n);
        n.reverse(3);
        System.out.println("n = " + n);

    }
}
