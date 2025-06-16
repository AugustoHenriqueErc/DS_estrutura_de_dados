package CircularLinkedList;

public class testCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        list.insertFirst(10);

        System.out.printf(list.getTail().getValue().toString());
    }
}
