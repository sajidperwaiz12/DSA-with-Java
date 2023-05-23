public class QueueUse {
    public static void main(String[] args) {
        QueuesUsingStack<Integer> queue = new QueuesUsingStack<>();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
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
