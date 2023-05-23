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

    public static void printRecursively(Node<Integer> head) {
        if (head == null) {
            return;
        }

        System.out.print(head.data + " ");
        printRecursively(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printRecursively(head);
    }
}
