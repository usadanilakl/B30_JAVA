package day35_Collection.customStack;

public class Stack <T> {
    public T data;
    public Stack<T> next;
    public Stack(T data, Stack<T> next){
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "data=" + data +
                '}';
    }
}
