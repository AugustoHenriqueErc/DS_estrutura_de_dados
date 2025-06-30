package doublyLinkedList;

public class testDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertHead(10);
        list.insertHead(5);
        list.insertHead(2);
        System.out.println(list);
    }
}
