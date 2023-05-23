import java.util.Queue;
import java.util.Stack;

public class QueuesUsingStack<T> {
    private Stack<T> s1;
    private Stack<T> s2;

    public QueuesUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public int size() {
        return s1.size();
    }

    public boolean isEmpty() {
        return s1.size() == 0;
    }

    public void enqueue(T ele) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(ele);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public T dequeue() throws QueueEmptyException {
        if (s1.isEmpty()) {
            throw new QueueEmptyException();
        }
        return s1.pop();
    }

    public T front() throws QueueEmptyException {
        if (s1.isEmpty()) {
            throw new QueueEmptyException();
        }
        return s1.peek();

    }
}
