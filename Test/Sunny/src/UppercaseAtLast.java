import java.util.Scanner;

public class UppercaseAtLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(uppercaseAtLast(str));
    }

    public static String uppercaseAtLast(String str) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                sb.append(str.charAt(i));
            } else {
                sb.insert(index, str.charAt(i));
                index++;
            }
        }
        return sb.toString();
    }
}
