import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1_exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int t = input.nextInt();
            numbers.add(t);
        }

        int A=0 , B=0 , C=0 , D=0 ;
        for (int i = 0; i < T; i++) {
            int n = numbers.get( i );
            if ( 90<=n && n<=100 ){
                A++;
            }
            else if ( 80<=n && n<90 ){
                B++;
            }
            else if ( 70<=n && n<80 ){
                C++;
            }
            else if ( 60<=n && n<70 ){
                D++;
            }
        }
        System.out.printf("A: %d\n",A);
        System.out.printf("B: %d\n",B);
        System.out.printf("C: %d\n",C);
        System.out.printf("D: %d\n",D);


    }
}