package day35_Collection.customLinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> names = new MyLinkedList<>();
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        names.addFirst("Dana");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        names.addFirst("Danil");
        System.out.println("names = " + names);
        System.out.println("Head: " + names.getHead());
        System.out.println("Tail: " + names.getTail());
        System.out.println("--------------------------Adding to the end-------------------------------");

        names.addLast("Dante");
        names.addLast("Didi");
        System.out.println("names = " + names);
        System.out.println("Head: " + names.getHead());
        System.out.println("Tail: " + names.getTail());
        System.out.println("---------------------------Removing--------------------------------");

        names.removeElement("Danil");
        System.out.println("names = " + names);
        System.out.println("Head: " + names.getHead());
        System.out.println("Tail: " + names.getTail());
        System.out.println("names.size() = " + names.size());
        System.out.println("-------------------------------Iteration----------------------------------------");

        names.addFirst("Danil");
        names.addLast("Klokovs");
        System.out.println(names);
        System.out.println("Head: " + names.getHead());
        System.out.println("Tail: " + names.getTail());
        System.out.println("names.size() = " + names.size());
        names.iteration((c)->{
            if(c.startsWith("K")) System.out.println("removed: " + names.removeElement(c));
        });

        System.out.println(names);
        System.out.println("Head: " + names.getHead());
        System.out.println("Tail: " + names.getTail());
        System.out.println("names.size() = " + names.size());



    }
}
