package day35_Collection.customQueue;

import day35_Collection.customStack.StackList;

public class QList <T>{
    private Qnode<T> first;
    private Qnode<T> last;
    private int size;
    public void enq(T data){
        Qnode<T> d = new Qnode<>(data, null);
        if(first == null){
            first = d;
            last = first;
        }else{
            d.next = first;
            first = d;
        }
        size++;
    }
    public T deq(){
        Qnode<T> c = first;
        while (c.next.next != null){
            c = c.next;
        }
        Qnode<T> t = last;
        c.next = null;
        last = c;
        size--;
        return t.data;
    }
    public T peek(){
        return last.data;
    }
    public boolean isEmpty(){
        if(first != null    ) return true;
        return false;
    }
    public void reverse(int k){
        StackList<T> temp = new StackList<>();
        for(int i = 0; i<k; i++){
            temp.push(this.deq());
        }

        while(temp.peek() != null){
            this.enq(temp.pop().data);
        }
        for (int i = 0; i < this.size-k; i++) {
            this.enq(this.deq());
        }


    }
    public void reverse2(int k){
        StackList<T> n = new StackList<>();
        for (int i = 0; i < this.size-k; i++) {
            this.enq(this.deq());
        }
        for (int i = 0; i < k; i++) {
            n.push(this.deq());
        }
        while (n.getSize()>0){
            this.enq(n.pop().data);
        }
    }

    @Override
    public String toString() {
        String r = "";
        Qnode<T> c = first;
        while (c != null){
            r += c.data + ", ";
            c = c.next;
        }
        return r;
    }
}
