import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strNums = str.split(" ");
        for (int i = 0; i < strNums.length; i++) {
            System.out.print(strNums[i] + " ");
        }
    }
}