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

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        //Your code goes here
        int len = length(head);
        if (n == 0 || n >= len) {
            return head;
        }
        Node<Integer> temp = head;
        int i = 0;
        while (i < (len - n - 1)) {
            temp = temp.next;
            i++;
        }
        Node<Integer> tail = temp;
        Node<Integer> newHead = temp.next;
        tail.next = null;

        Node<Integer> newTemp = newHead;
        while (newTemp.next != null) {
            newTemp = newTemp.next;
        }
        newTemp.next = head;

        return newHead;
    }

    public static int length(Node<Integer> head) {
        int len = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int n = s.nextInt();
            head = appendLastNToFirst(head, n);
            print(head);
        }
    }
}
