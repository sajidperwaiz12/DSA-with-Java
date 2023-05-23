import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();

        boolean isEqual = (i == j);
        boolean neq = (i != j);
        boolean isgr = (i > j);
        boolean isgreq = (i >= j);
        boolean isLess = (i < j);
        boolean isLessEq = (i <= j);
        System.out.println("Is Equal " + isEqual);
        System.out.println("Is Not Equal " + neq);
        System.out.println("Is Greater " + isgr);
        System.out.println("Is Greater Equal " + isgreq);
        System.out.println("Is Less " + isLess);
        System.out.println("Is Less Equal " + isLessEq);
    }
}
