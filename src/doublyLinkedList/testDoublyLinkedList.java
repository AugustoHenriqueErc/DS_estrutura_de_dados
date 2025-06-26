package doublyLinkedList;

public class testDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertFirst(2);
        System.out.println(list);
    }
}
