public class LinkedListUse {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.getSize());
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.insertAtLast(99);
        list.insert(100, 3);
        list.print();

        System.out.println(list.deleteFirst());
        list.print();

        System.out.println(list.deleteLast());
        list.print();

        System.out.println(list.delete(2));
        list.print();
        System.out.println(list.getSize());

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
