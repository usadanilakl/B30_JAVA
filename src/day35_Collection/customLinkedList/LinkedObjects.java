package day35_Collection.customLinkedList;

public class LinkedObjects <T>{
    public T data;
    public LinkedObjects<T> next;
    public int index;

    public LinkedObjects(T data, LinkedObjects<T> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedObjects)) return false;

        LinkedObjects<?> that = (LinkedObjects<?>) o;

        return data.equals(that.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

}
