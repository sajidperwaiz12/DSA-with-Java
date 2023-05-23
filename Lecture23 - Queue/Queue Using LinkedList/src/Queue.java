public class Queue {

    //Define the data members
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        //Implement the Constructor
        front = null;
        rear = null;
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


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        Node newNode = new Node(data);
        if (size == 0) {
            front = newNode;
            rear = newNode;
            size++;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }


    public int dequeue() {
        //Implement the dequeue() function
        if (size == 0) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (size == 1) {
            rear = null;
        }
        size--;
        return val;
    }


    public int front() {
        //Implement the front() function
        if (size == 0) {
            return -1;
        }
        return front.data;
    }
}
