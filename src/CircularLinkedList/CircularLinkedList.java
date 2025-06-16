package CircularLinkedList;

public class CircularLinkedList<T> {
    private Cell<T> first;
    public CircularLinkedList()
    {
        first = null;
    }
    public void insertFirst(T value){
        this.inserirNoInicio(new Cell<T>(value));
    }
    private void inserirNoInicio(Cell<T> cell){
        cell.next = first;
        first = cell;
    }

    private void insertLast(Cell<T> cell)
    {
        Cell aux = first;
        while(aux.getNext() != null){
            aux = aux.getNext();
        };
        aux.setNext(cell);
    }
    public void insertLast(T value)
    {
        insertLast(new Cell<T>(value));
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
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedList{");
        Cell aux = first;
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