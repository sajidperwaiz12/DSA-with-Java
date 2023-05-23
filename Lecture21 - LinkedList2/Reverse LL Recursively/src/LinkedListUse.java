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

    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }

        Node<Integer> newHead = reverseLinkedListRec(head.next);
        Node<Integer> temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;

        return newHead;
    }

    public static Node<Integer> reverseLinkedListRec2(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }

        Node<Integer> newHead = reverseLinkedListRec(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static DoubleNode reverseLinkedListRec3(Node<Integer> head) {
        if (head == null || head.next == null) {
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        DoubleNode smallAns = reverseLinkedListRec3(head.next);
        smallAns.tail.next = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
//        head = reverseLinkedListRec(head)
//        head = reverseLinkedListRec2(head);
        DoubleNode ans = reverseLinkedListRec3(head);
        print(ans.head);
    }
}
