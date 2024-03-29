public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();

        for (int i = 1; i <= 5; i++) {
            try {
                queue.enqueue(i);
            } catch (QueueFullException e) {
                // Never reach here
            }
        }

        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                // Never reach here
            }
        }
    }
}
