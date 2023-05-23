import javax.sound.sampled.Line;
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

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here
        if (i == j) {
            return head;
        }

        Node<Integer> currentNode = head, prev = null;
        Node<Integer> firstNode = null, secondNode = null, firstNodePrev = null, secondNodePrev = null;
        int pos = 0;
        while (currentNode != null) {
            if (pos == i) {
                firstNodePrev = prev;
                firstNode = currentNode;
            } else if (pos == j) {
                secondNodePrev = prev;
                secondNode = currentNode;
            }

            prev = currentNode;
            currentNode = currentNode.next;
            pos++;
        }

        if (firstNodePrev != null) {
            firstNodePrev.next = secondNode;
        } else {
            head = secondNode;
        }

        if (secondNodePrev != null) {
            secondNodePrev.next = firstNode;
        } else {
            head = firstNode;
        }

        Node<Integer> currentFirstNode = secondNode.next;
        secondNode.next = firstNode.next;
        firstNode.next = currentFirstNode;

        return head;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            Node<Integer> head = takeInput();
            int i = s.nextInt();
            int j = s.nextInt();
            head = swapNodes(head, i, j);
            print(head);
        }
    }
}
