package linkedList;

public class testLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertFirst(10);
        list.insertLast(20);
        list.insertFirst(5);
        list.insertLast(30);
        System.out.println(list.search(30));
        list.print();
    }
}
