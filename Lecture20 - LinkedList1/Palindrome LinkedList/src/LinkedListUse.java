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

    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null) {
            return true;
        }

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node<Integer> secondHead = slow.next;
        slow.next = null;
        secondHead = reverseLinkedList(secondHead);

        Node<Integer> firstSubList = secondHead;
        Node<Integer> secondSubList = head;

        while (firstSubList != null) {
            if (firstSubList.data != secondSubList.data) {
                return false;
            }
            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
        }

        firstSubList = head;
        secondSubList = reverseLinkedList(secondHead);

        while (firstSubList.next != null) {
            firstSubList = firstSubList.next;
        }

        firstSubList.next = secondSubList;

        return true;
    }

    private static Node<Integer> reverseLinkedList(Node<Integer> secondHead) {
        Node<Integer> curr = secondHead;
        Node<Integer> prev = null;
        Node<Integer> fwd;

        while (curr != null) {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            System.out.println(isPalindrome(head));
        }
    }
}
