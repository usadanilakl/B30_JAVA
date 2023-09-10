package day35_Collection.customLinkedList.practice;

import day35_Collection.customLinkedList.LinkedObjects;
import day35_Collection.customLinkedList.MyLinkedList;

public class Practice {
    public static void main(String[] args) {
        MyLinkedList<String> names = new MyLinkedList<>();
        names.addFirst("Danil");
        names.addFirst("Dana");
        names.addLast("Dante");
        names.addLast("Didi");
        names.addFirst("Danil2");
        names.addFirst("Dana2");
        names.addLast("Dante2");
        names.addLast("Didi2");
        //***********************************index of****************************************
        System.out.println("names.indexOf = " + names.indexOf("Didi"));

        //***********************************Kth item from the last (size is unknown************************************
//        int k = 5;
//        LinkedObjects <String> current = names.getHead();
//        LinkedObjects <String> current2 = names.getHead();
//        for(int i = 0; i<k; i++){
//            current = current.next;
//        }
//        while (current.next != null){
//            current2 = current2.next;
//            current = current.next;
//        }
//
//        System.out.println(current2.data);
//        System.out.println(current2.data);
        System.out.println("list: "+names);

        System.out.println("names.KthFromLast(4) = " + names.KthFromLast(5));
        names.removeKthFromLast(5);
        System.out.println(names);

    }
}
