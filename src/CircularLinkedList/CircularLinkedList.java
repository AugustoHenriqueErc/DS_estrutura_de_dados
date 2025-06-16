package CircularLinkedList;

import java.util.HashMap;

public class CircularLinkedList<T> {
    private Cell<T> tail;
    private Cell<T> head;
    public CircularLinkedList()
    {
        tail = null;
        head = null;
    }

    public void insertFirst(T value){
        this.insertFirst(new Cell<T>(value));
    }
    private void insertFirst(Cell<T> cell){
        if(tail == null)
        {
            tail = cell;
            tail.setNext(cell);
        }

        cell.next = tail.getNext();
        tail.setNext(cell);
    }

    public boolean search(T value)
    {
        Cell aux = tail.getNext();
        while(aux != null)
        {
            if(aux.getValue() == value) return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList{");
        Cell aux = tail.getNext();
        while(aux != null)
        {
            sb.append(aux.getValue()+", ");
            aux = aux.getNext();
        }
        sb.append("}");
        return sb.toString();
    }

    public void print()
    {
        System.out.println(this.toString());
    }

}