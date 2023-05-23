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

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        //Your code goes here
        if (head == null) {
            return head;
        }

        Node<Integer> temp = head;
        Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = temp;
                } else {
                    evenTail.next = temp;
                }
                evenTail = temp;
            } else {
                if (oddHead == null) {
                    oddHead = temp;
                } else {
                    oddTail.next = temp;
                }
                oddTail = temp;
            }
            temp = temp.next;
        }

        if (oddHead == null) {
            return evenHead;
        }

        oddTail.next = evenHead;
        evenTail.next = null;
        return oddHead;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            head = evenAfterOdd(head);
            print(head);
        }
    }
}
