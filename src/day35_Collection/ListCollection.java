package day35_Collection;

import day33_Polimorphism.cars.Vehicle;

import java.time.LocalTime;
import java.time.Period;
import java.util.*;

public class ListCollection extends Thread{
    public static void main(String[] args) {
        Integer[] arr = {33,11,23,53,77,103,33,11,23,53,77,103};

        // lists have index, duplicates are allowed, insertion order is preserved

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr)); // uses array = easy to get elements
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(arr)); // uses doubly linked nodes = easy to insert and remove, inherits FIFO insertion order from dequeue interface
        Vector<Integer> vector = new Vector<>(Arrays.asList(arr)); // uses array and it is synchronized = safe to use in multi-thread environment.
        Stack<Integer> stack = new Stack<>(); stack.addAll(Arrays.asList(arr)); // extends Vector, specialty is "Last in First out" insertion/retrieval order

        countTimeToInsert(arrList);
        countTimeToInsert(linkedList);
        int arrListTime = countTimeToGet(arrList);
        int linkedListTime = countTimeToGet(linkedList);
        //System.out.println("time difference is: " + (arrListTime-linkedListTime));
        System.out.println("----------------------------------------------------");

        System.out.println("stack = " + stack);
        System.out.println("stack.push(777) = " + stack.push(777));
        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);

        System.out.println("---------------------------------------------------");
        
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(777);
        linkedList1.add(888);
        linkedList1.add(999);
        linkedList1.add(111);
        System.out.println("linkedList1 = " + linkedList1);
        linkedList1.poll();
        System.out.println("linkedList1 = " + linkedList1);

        System.out.println("------------------------------------------------------");

        ListCollection one = new ListCollection();
        ListCollection two = new ListCollection();
        ListCollection three = new ListCollection();
        ListCollection four = new ListCollection();

        one.run();
        two.run();
        three.run();
        four.run();



    }

    public static ArrayList<Integer> arrL= new ArrayList<>(Arrays.asList(2000));
    public static Vector<Integer> vector = new Vector<>(Arrays.asList(2000));

    public void run(){
//        Integer n = 100;
//        while (n>0){
//            n = vector.get(0)-10 ;
//            vector.set(0,n);
//            System.out.print(vector.get(0) + " ");
//        }
//        System.out.println("--------------------------------------------");

        Integer b = 100;
        while (b>0){
            b = arrL.get(0)-10 ;
            arrL.set(0,b);
            System.out.print(arrL.get(0)+ " ");
        }

    }

    public static int countTimeToGet(List<Integer> list){
        LocalTime start = LocalTime.now();
        for(int i = 0; i<list.size(); i++){
            list.get(i);
        }
        int period = LocalTime.now().getNano()-start.getNano();
        System.out.println("Get time: " + period);
        return period;
    }

    public static int countTimeToInsert(Collection<Integer> list){
        LocalTime start = LocalTime.now();
        for(int i = 0; i<10000; i++){
            list.add(i*173);
        }
        int period = LocalTime.now().getNano()-start.getNano();
        System.out.println("Insert time: " + period);
        return period;
    }

}
