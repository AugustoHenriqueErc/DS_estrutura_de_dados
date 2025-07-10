package linkedList;

public class LinkedList<T> {
    private Cell<T> first;
    public LinkedList()
    {
        first = null;
    }
    private boolean isEmpty() {
        return (first == null);
    }
    public void insertFirst(T value){
        Cell<T> cell = new Cell<T>(value);
        if(isEmpty())first = cell;
        else{
            cell.next = first.getNext() ;
            first.setNext(cell);
        }
    }
    public void insertLast(T value)
    {
        Cell<T> cell = new Cell<>(value);
        if(isEmpty()) first = cell;
        else {
            Cell<T> aux = first;
            do {
                aux = aux.getNext();
            }while(aux.getNext() != null);
            aux.setNext(cell);
        }
    }
    public boolean search(T value)
    {
        Cell aux = first;
        while(aux != null)
        {
            if(aux.getValue() == value) return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        if(isEmpty()) return "This LinkedList is empty";
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList{");
        Cell<T> aux = first;
        while(aux != null)
        {
            sb.append(aux).append(", ");
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