import java.util.Scanner;

public class Group {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        makeGroup(str, n);
    }

    public static void makeGroup(String str, int n) {
        int si = 0;
        int ei = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) + 1 == str.charAt(i + 1) && ei < str.length() - 2) {
                ei++;
            } else {
                System.out.println(str.substring(si, ei + 1));
                si = i + 1;wo
                ei = i + 1;
            }
        }
    }
}
