package day35_Collection.customLinkedList;

import java.util.function.Consumer;

public class MyLinkedList<T> {

    private LinkedObjects<T> head;
    private LinkedObjects<T> tail;
    private int size;

    public void addFirst(T data){
        if(isEmpty()){
            tail = head = new LinkedObjects<T>(data, null);
            size++;
        }else if(head != null){
            LinkedObjects<T> current = new LinkedObjects<T>(data, head);
            head = current;
            size++;
        }
    }

    public void addLast(T data){
        if(isEmpty()){
            tail = head = new LinkedObjects<>(data, null);
        }else{
            LinkedObjects<T> current = new LinkedObjects<T>(data, null);
            tail.next = current;
            tail = current;
        }
        size++;
    }

    public boolean removeElement(T data){
        LinkedObjects<T> current = head.next;
        LinkedObjects<T> previous = head;
        LinkedObjects<T> removing = new LinkedObjects<T>(data, null);
        if(head.equals(removing)){
            head = head.next;
            size--;
            return true;
        } else {
            while (current.next != null){
                if(current.equals(removing)){
                    previous.next = current.next;
                    current.next = null;
                    size--;
                    return true;
                }else{
                    previous = current;
                    current = current.next;
                }
            }
            if(tail.equals(removing)){
                previous.next = null;
                tail = previous;
                size--;
                return true;
            }

        }

        return false;
    }

    public void iteration(Consumer<T> c){
        LinkedObjects<T> previous = head;
        LinkedObjects<T> current = head;
        while (current != null){
            c.accept(current.data);
            previous = current;
            current = current.next;
        }

    }

    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }

    public int size(){
        return size;
    }

    public T getHead(){
        return head.data;
    }

    public T getTail(){
        return tail.data;
    }

    @Override
    public String toString() {
        String print = "";
        LinkedObjects<T> current = head;
        while (current != null){
            print += current.data + ", ";
            current = current.next;
        }
        return print.substring(0,print.length()-2) + ".";
    }
}
