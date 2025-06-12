package LinkedList;

public class Cell<T>{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    Cell next;
    public Cell(T value){
        this.value = value;
        this.next = null;
    }

    public Cell getNext() //throws NullPointerException
    {
        return next;
    }

    public T getValue() {
        return value;
    }
}
