import java.util.Scanner;

public class TreeUse {
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        System.out.println();
    }

    public static TreeNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data ");
        int data = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.print("Enter child count ");
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
}
