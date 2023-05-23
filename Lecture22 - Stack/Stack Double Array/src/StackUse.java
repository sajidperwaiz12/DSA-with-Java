public class StackUse {
    public static void main(String[] args) throws StackEmptyException {
        Stack stack = new Stack(3);
        for (int i = 1; i <= 3; i++) {
            stack.push(i);
        }
        System.out.println(stack.pop());
        stack.push(4);
        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // Never reach here
            }
        }
    }
}
