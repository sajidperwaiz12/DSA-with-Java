public class StackUsingLL {
    //Define the data members
    Node top;
    int size;

    public StackUsingLL() {
        //Implement the Constructor
        top = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node node = new Node(element);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() throws StackEmptyException {
        //Implement the pop() function
        if (size == 0) {
            // StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public int top() throws StackEmptyException {
        //Implement the top() function
        if (size == 0) {
            // StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return top.data;
    }
}
