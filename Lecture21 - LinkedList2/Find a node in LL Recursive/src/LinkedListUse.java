import java.util.Scanner;

public class LinkedListUse {
    private static Scanner s = new Scanner(System.in);

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        int data = s.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            data = s.nextInt();
        }

        return head;
    }

    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        return findNodeRec(head, n, 0);
    }

    public static int findNodeRec(Node<Integer> head, int n, int pos) {
        //Your code goes here
        if (head == null) {
            return -1;
        }

        if (head.data == n) {
            return pos;
        }
        return findNodeRec(head.next, n, pos + 1);
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int n = s.nextInt();
            System.out.println(findNodeRec(head, n));
        }
    }
}
