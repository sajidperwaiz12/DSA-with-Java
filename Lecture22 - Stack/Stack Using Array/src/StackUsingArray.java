public class StackUsingArray {
    private int[] data;
    private int top; // is the index of topmost element of stack

    public StackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public StackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int top() throws StackEmptyException {
        if (size() == 0) {
            // StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int ele) throws StackFullException {
        if (size() == data.length) {
            // Stack Full
            StackFullException e = new StackFullException();
            throw e;
        }
        top++;
        data[top] = ele;
    }

    public int pop() throws StackEmptyException {
        int val = top();
        top--;
        return val;
    }
}
