package Queue;

public class testQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        System.out.println(queue);
    }
}
