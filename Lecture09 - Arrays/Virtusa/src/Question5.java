import java.util.*;


public class Question5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] strArray = str.split("\\s");
        for(int index=0; index < strArray.length; index++) {
            String temp = strArray[index];
            String firstUppercase = Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
            sb.append(firstUppercase);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
