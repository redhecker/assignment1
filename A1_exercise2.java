import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class A1_exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        List<Double> numbers = new ArrayList<>();
        for (int i = 0 ; i < T; i++) {
            for (int j =0 ; j < 5 ; j++ ) {
                double t = input.nextDouble();
                numbers.add(t);
            }
        }

        for (int i = 0 ; i < T; i++) {
            double x1 = numbers.get( 5*i   );
            double y1 = numbers.get( 5*i+1 );
            double x2 = numbers.get( 5*i+2 );
            double y2 = numbers.get( 5*i+3 );
            double x  = numbers.get( 5*i+4 );
            double a  = ( y1-y2 ) /( x1-x2 );
            double b  = y1 - a * x1 ;
            double y  = a * x + b ;
            System.out.printf ("%.1f\n", y );

        }
    }
}

