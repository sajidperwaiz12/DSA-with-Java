import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    //Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Stack() {
        //Implement the Constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.size() == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        q1.add(element);
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public int pop() {
        //Implement the pop() function
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.poll();
    }

    public int top() {
        //Implement the top() function
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }
}
