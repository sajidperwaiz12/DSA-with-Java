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
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }

        return head;
    }

    public static void printIthNode(Node<Integer> head, int i){
        //Your code goes here
        while (i-- > 0) {
            if (head == null) {
                return;
            }
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int i = s.nextInt();
            printIthNode(head, i);
        }
    }
}
