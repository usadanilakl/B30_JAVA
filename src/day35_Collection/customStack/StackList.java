package day35_Collection.customStack;

public class StackList <T> {
    private Stack<T> bottom;
    private Stack<T> top;
    private int size;

    public void push(T data){
        Stack<T> d = new Stack<>(data, null);
        if(bottom == null){
            bottom = top = d;
        }else{
            top.next = d;
            top = d;
        }
        size++;
    }
    public Stack<T> pop(){
        if(bottom.next == null){
            Stack<T> temp = top;
            bottom = null;
            top = null;
            size = 0;
            return temp;
        }else{
            Stack<T> current = bottom;
            Stack<T> previous = current;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            Stack<T> temp = top;
            previous.next = null;
            top = previous;
            size--;
            return  temp;
        }

    }
    public Stack<T> peek(){
        return top;
    }

    @Override
    public String toString() {
        Stack<T> current = bottom;
        String data = "";
        while (current!=null){
            data+=current.data+", ";
            current=current.next;
        }
        return data;
    }

    public Stack<T> pop2(){
        Stack<T> tem = top;
        Stack<T> cu = bottom;
        while (cu.next.next!=null){
            cu = cu.next;
        }
        top = cu;
        top.next = null;
        return tem;
    }

    public int getSize(){
        return size;
    }
}
