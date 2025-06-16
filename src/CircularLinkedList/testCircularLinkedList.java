package CircularLinkedList;

public class testCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertFirst(5);
        list.insertLast(30);
        System.out.println(list.search(30));
        list.print();
    }
}
