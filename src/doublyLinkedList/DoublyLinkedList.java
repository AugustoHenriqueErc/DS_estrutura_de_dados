package doublyLinkedList;

public class DoublyLinkedList<T>
{
    private Cell<T> head;
    public DoublyLinkedList()
    {
        head = null;
    }
    private boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }
    private boolean isUnitary()
    {
        if(!isEmpty() && head.getNext() == null) return true;
        else return false;
    }

    public void insertFirst(T value)
    {
        Cell<T> c = new Cell<>(value);
       if(isEmpty()) head = c;
       else {
           head.setAnt(c);
           c.setNext(head);
           c.setAnt(null);
           head = c;
       }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList{");
        Cell c = head;
        do
        {
            sb.append(c.getValue()+", ");
            c = c.getNext();
        }while(c == null);
        sb.append(c.getValue()).append("}");
        return sb.toString();
    }
}

