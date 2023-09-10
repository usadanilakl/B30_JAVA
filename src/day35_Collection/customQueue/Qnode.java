package day35_Collection.customQueue;

public class Qnode <T> {
    public T data;
    public Qnode<T> next;

    public Qnode(T data, Qnode<T> next) {
        this.data = data;
        this.next = next;
    }
}
