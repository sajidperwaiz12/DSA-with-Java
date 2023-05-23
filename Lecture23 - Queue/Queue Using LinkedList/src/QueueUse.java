public class QueueUse {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
