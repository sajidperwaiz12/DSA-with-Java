import java.util.Scanner;

public class TreeUse {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        print(root);
    }

    public static TreeNode<Integer> takeInput() {
        int data = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s = s + root.children.get(i).data;
            if (i != root.children.size() - 1) {
                s = s + ",";
            }
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }
}
