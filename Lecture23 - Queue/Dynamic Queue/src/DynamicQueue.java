public class DynamicQueue {
    private int front;  // index at which front element is stored
    private int rear;  // index at which rear element is stored
    private int[] data;

    private int size;

    public DynamicQueue() {
        this(10);
    }

    public DynamicQueue(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            // QueueEmptyException
            throw new QueueEmptyException();
        }
        return data[front];
    }

    public void enqueue(int ele) throws QueueFullException {
        if (size == 0) {
            front = 0;
        }
        if (size == data.length) {
            doubleCapacity();
        }
        size++;
        rear = (rear + 1) % data.length;
//        rear++;
//        if (rear == data.length) {
//            rear = 0;
//        }
        data[rear] = ele;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        for (int i = 0; i <= rear; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            // QueueEmptyException
            throw new QueueEmptyException();
        }
        int val = data[front];
        front = (front + 1) % data.length;
//        front++;
//        if (front == data.length) {
//            front = 0;
//        }
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return val;
    }
}
