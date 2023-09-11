package day35_Collection.heap;

import java.util.NoSuchElementException;

public class MyHeap {
    int[] list;
    int size;
    public MyHeap(int capacity){
        this.list = new int[capacity];
        size = 0;
    }
    public int peek(){
        if(size == 0) throw new NoSuchElementException();
        return list[0];
    }

    public void insert(int data){
        if(size==0) list[0]=data;
        else list[size-1]=data;
    }
}
