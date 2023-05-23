import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(' ');
                sb.append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
