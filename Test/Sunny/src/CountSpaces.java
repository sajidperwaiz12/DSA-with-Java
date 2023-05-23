import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(countWords(str));
    }

    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                count++;
            }
        }
        return count + 1;
    }
}
