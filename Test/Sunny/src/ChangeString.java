import java.util.Scanner;

public class ChangeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("Changed string: " + changeString(str));
    }

    public static String changeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() % 2 == 0 && i % 2 == 0) {
                sb.append("*");
            } else if (str.length() % 2 != 0 && i % 2 != 0){
                sb.append("*");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
