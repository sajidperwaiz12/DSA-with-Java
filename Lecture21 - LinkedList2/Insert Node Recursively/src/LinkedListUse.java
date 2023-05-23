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

    public static Node<Integer> insertRecursively(Node<Integer> head, int pos, int ele) {
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(ele);
            newNode.next = head;
            return newNode;
        }

        if (head == null) {
            return head;
        }

        Node<Integer> newNode = insertRecursively(head.next, pos - 1, ele);
        head.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insertRecursively(head, 6, 10);
        print(head);
    }
}
