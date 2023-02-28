import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int current_term = s.nextInt();
        boolean isDecreasing = true, is_valid_sequence_yet = true;
        int i=2;// first term of sequence has already been taken
        while(i<=n){
            int next_term = s.nextInt();
            if(is_valid_sequence_yet && isDecreasing && current_term>next_term){
                current_term=next_term;
               // isDecreasing=true;
            }else if(is_valid_sequence_yet && current_term < next_term){
                current_term=next_term;
                isDecreasing = false;
            }else{
                is_valid_sequence_yet=false;
            }
            i++;
        }
        System.out.println(is_valid_sequence_yet);
    }
}
