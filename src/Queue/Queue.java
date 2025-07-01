package Queue;

public class Queue<T> {
    private Cell<T> head;
    private Cell<T> tail;

    public Queue(){
        head = null;
        tail = null;
    }
    private boolean isEmpty(){
        return (head == null);
    }
    public void insert(T value){
        Cell<T> cell = new Cell<>(value);
        if(isEmpty()) {
            head = cell;
            tail = cell;
            cell.setNext(cell);
        }
        else {
            cell.setNext(head);
            head = cell;
        }
    }
    @Override
    public String toString()
    {
        if (isEmpty()) return "This queue is empty";
        else {
            StringBuilder sb = new StringBuilder();
            Cell<T> aux = head;
            sb.append("Queue {");
            do{
                sb.append(aux.getValue()).append(" ,");
            }while (aux.getNext() != null);
            sb.append("}");
            return sb.toString();
        }

    }
}
