import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(30);
        list.addFirst(40);
        list.add(1, 20);
        System.out.println(list.size());
        list.set(2, 100);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");;
        }
    }
}
