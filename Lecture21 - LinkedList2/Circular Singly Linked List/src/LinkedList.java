public class LinkedList {
    private Node head;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    public void insertAtFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = head;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        head = node;
        size++;
    }

    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            insertAtFirst(data);
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        size++;
    }

    public void insert(int data, int index) throws Exception {
        if (index > size) {
            Exception IndexOutOfBoundsException = new Exception();
            throw IndexOutOfBoundsException;
        }
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if (index == size) {
            insertAtLast(data);
            return;
        }

        int i = 0;
        Node node = new Node(data);
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.data;
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = head;
        size--;
        return val;
    }

    public int delete(int index) throws Exception {
        if (index >= size) {
            Exception ArrayIndexOutOfBoundsException = new Exception();
            throw ArrayIndexOutOfBoundsException;
        }
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public int getSize() {
        return this.size;
    }

    public int get(int index) throws Exception {
        if (index >= size) {
            Exception ArrayIndexOutOfBoundsException = new Exception();
            throw ArrayIndexOutOfBoundsException;
        }
        int i = 0;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }

    public void print() {
        System.out.print(head.data + " ");
        Node temp = head.next;
        while (temp != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
