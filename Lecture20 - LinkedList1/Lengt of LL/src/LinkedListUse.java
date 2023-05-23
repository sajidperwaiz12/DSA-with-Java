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

    public static int length(Node<Integer> head){
        //Your code goes here
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            System.out.println(length(head));
        }
    }
}
