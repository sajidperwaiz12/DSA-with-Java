import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read a non-empty string from the user
        String str = input.nextLine();

        // count the number of vowels in the string
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // display the number of vowels in the string
        System.out.println(count);
    }
}
