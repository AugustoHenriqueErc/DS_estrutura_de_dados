package queue;

public class Cell<T> {
    T value;
    Cell<T> next;
    public Cell(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public Cell<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }
}
