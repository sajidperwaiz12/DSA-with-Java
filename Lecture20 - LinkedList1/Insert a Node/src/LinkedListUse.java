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

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
            i++;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 80, 5);
        print(head);
    }
}
