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

    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        Node<Integer> temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == n) {
                return i;
            }
            i++;
            temp = temp.next;
        }

        return -1;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int n = s.nextInt();
            System.out.println(findNode(head, n));
        }
    }
}
