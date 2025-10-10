import java.util.Scanner;

public class ra_4_check_leap_year_or_not{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the year to check leap year or not: ");
        int n = sc.nextInt();

        if(n % 400 == 0){
            if(n % 100 == 0){
                System.out.print("this year is leap year");
            }
        }
        else if(n % 4 == 0){
            System.out.println("this year is leap year");
        }
        else System.out.println("this year is not leap year");
    }
}