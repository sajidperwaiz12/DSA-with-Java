import java.util.Scanner;

public class LinkedListUse {
    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
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

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        // Write your code here.
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            if (temp.next == null) {
                return head;
            }
            temp = temp.next;
            i++;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = deleteNode(head, 2);
        print(head);
    }
}
