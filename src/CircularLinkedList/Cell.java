package CircularLinkedList;

public class Cell<T>{
    T value;
    Cell<T> next;

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }

    public Cell(T value){
        this.value = value;
        this.next = null;
    }

    public Cell<T> getNext() //throws NullPointerException
    {
        return next;
    }

    public T getValue() {
        return value;
    }
}
