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
            current.next = head;
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

    public LinkedObjects<T> getHead(){
        return head;
    }

    public LinkedObjects<T> getTail(){
        return tail;
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

    public int indexOf(T data){
        LinkedObjects  current = head;
        LinkedObjects obj = new LinkedObjects<>(data,null);
        int indx = 0;
        while (current != null){
            if(current.equals(obj)){
                return indx;
            }else{
                current = current.next;
                indx++;
            }
        }
        return -1;
    }
    public T KthFromLast(int k){
        LinkedObjects <T> one = head;
        LinkedObjects <T> two = head;
        for(int i = 0; i<k-1; i++){
            one = one.next;
        }
        while(one.next != null){
            two = two.next;
            one = one.next;
        }
        return two.data;
    }

    public void removeKthFromLast(int k){
        LinkedObjects <T> one = head;
        LinkedObjects <T> two = head;
        LinkedObjects<T> previous = one;
        for(int i = 0; i<k; i++){
            one = one.next;
        }
        while(one.next != null){
            previous = two;
            two = two.next;
            one = one.next;
        }
        two.next = two.next.next;
    }
}
