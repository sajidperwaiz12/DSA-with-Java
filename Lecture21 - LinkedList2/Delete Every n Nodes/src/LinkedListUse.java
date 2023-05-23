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

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        //Your code goes here
        if (M == 0 || head == null) {
            return null;
        }

        if (N == 0) {
            return head;
        }

        Node<Integer> currentNode = head;
        Node<Integer> temp = null;
        while (currentNode != null) {
            int take = 0;
            int skip = 0;

            while (currentNode != null && take < M) {
                if (temp == null) {
                    temp = currentNode;
                } else {
                    temp.next = currentNode;
                    temp = currentNode;
                }

                currentNode = currentNode.next;
                take++;
            }

            while (currentNode != null && skip < N) {
                currentNode = currentNode.next;
                skip++;
            }
        }

        if (temp != null) {
            temp.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int m = s.nextInt();
            int n = s.nextInt();
            head = skipMdeleteN(head, m, n);
            print(head);
        }
    }
}
