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

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        //Your code goes here
        if (k == 0 || k == 1) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> fwd = null, prev = null;

        int count = 0;
        while (count < k && current != null) {
            fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
            count++;
        }

        if (fwd != null) {
            head.next = kReverse(fwd, k);
        }

        return prev;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int k = s.nextInt();
            head = kReverse(head, k);
            print(head);
        }
    }
}
