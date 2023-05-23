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

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here
        if (head == null) {
            return head;
        }
        Node<Integer> t1 = head;
        Node<Integer> t2 = head.next;

        while (t2 != null) {
            if (!t1.data.equals(t2.data)) {
                t1.next = t2;
                t1 = t2;
            }
            t2 = t2.next;
        }

        if (t1.next != t2) {
            t1.next = t2;
        }

        return head;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            head = removeDuplicates(head);
            print(head);
        }
    }

}
