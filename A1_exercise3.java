import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class A1_exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0 ; i < T; i++) {
            int t = input.nextInt();
            numbers.add(t);
        }

        for (int i = 0 ; i < T; i++) {
            int year = numbers.get( i );
            if ( year%4==0 ^ year%100==0  |  year%400==0 ){
                System.out.println("Yes");
                int days = 307 ;
                if ( year < 2000 ){
                    year ++ ;
                    for ( ; year < 2000 ; year++ ){
                        if ( year%4==0 ^ year%100==0  |  year%400==0 ){
                            days += 366 ;
                        }
                        else {
                            days += 365 ;
                        }
                    }
                }
                else {
                    days = 59 ;
                    for (int j = 2000 ; j < year ; j++ ){
                        if ( j%4==0 ^ j%100==0  |  j%400==0 ){
                            days += 366 ;
                        }
                        else {
                            days += 365 ;
                        }
                    }
                }
                System.out.println( days );
            }
            else {System.out.println("No");}
        }
    }
}
