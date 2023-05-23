public class LinkedList {
    private Node head;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    public void insertAtFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            node.next = null;
            node.prev = null;
            head = node;
        } else {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void insertAtLast(int data) {
        if (head == null) {
            insertAtFirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }

    public void insert(int data, int index) {
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
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        node.next.prev = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int deleteLast() {
        Node temp = head;
        int i = 0;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public int getSize() {
        return this.size;
    }

    public int get(int index) {
        int i = 0;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
