package interfaces;

public interface manageable<T> {

    void add(T item);
    boolean remove(T item);
    T findById(String id);
    int getCount();
    void displayAll();

}