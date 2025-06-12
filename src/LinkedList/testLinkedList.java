package LinkedList;

public class testLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertLast(20);
        list.print();
    }
}
