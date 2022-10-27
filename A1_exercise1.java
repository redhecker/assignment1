import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class A1_exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0 ; i < T; i++) {
            int t = input.nextInt();
            numbers.add( t );
        }
        for (int i = 0 ; i < T; i++) {
            int n = numbers.get( i );
            if( n==1^n==3^n==5^n==7^n==8^n==10^n==12 ){
                System.out.println("yes");
            }
            else{System.out.println("no");}
        }
    }
}
