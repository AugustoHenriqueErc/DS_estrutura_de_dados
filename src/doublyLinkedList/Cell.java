package doublyLinkedList;

public class Cell<T>
{
    T value;
    Cell<T> ant;
    Cell<T> next;
    public Cell(T value)
    {
        this.value = value;
        ant = null;
        next = null;
    }

    public Cell<T> getNext() {
        return next;
    }

    public Cell<T> getAnt() {
        return ant;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }

    public void setAnt(Cell<T> ant) {
        this.ant = ant;
    }
}
