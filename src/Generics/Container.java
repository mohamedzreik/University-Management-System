package Generics;

public class Container <T>{

    private T[] items;
    private int size;
    private int capacity;
    static final int DEFAULT_CAPACITY = 10;

    public Container(){
        this(DEFAULT_CAPACITY);
    }

    public Container(int capacity){
        this.capacity = capacity;
        items = (T[]) new Object[capacity];
    }




    public void add(T item){
        if(size == capacity){
            throw new RuntimeException("Container is full");
        }
        items[size++] = item;
    }

    public T remove(T item){
        for(int i = 0; i < size; i++){
            if(items[i].equals(item)){
                T temp = items[i];
                items[i] = items[--size];
                items[size] = null;
                return temp;
            }
        }
        return item;
    }


    public T get(int index){
        return items[index];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public void isFull(){
        if(size == capacity) System.out.println("Container is full");
    }
    public void clear(){
        for(int i = 0; i < size; i++){
            items[i] = null;
        }
        size = 0;
    }
    public void Contents(T item){
        for(int i = 0; i < size; i++){
            System.out.println(items[i]);
        }
    }
    public void toarray(){
        for(int i = 0; i < size; i++){
            System.out.println(items[i]);
        }
    }
}
