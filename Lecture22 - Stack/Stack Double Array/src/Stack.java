public class Stack {
    private int[] data;
    private int top;

    public Stack() {
        data = new int[10];
        top = -1;
    }

    public Stack(int capacity) {
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

    public void push(int ele) {
        if (size() == data.length) {
            doubleCapacity();
        }
        top++;
        data[top] = ele;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public int pop() throws StackEmptyException {
        int val = top();
        top--;
        return val;
    }
}
