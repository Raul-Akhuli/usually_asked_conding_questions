import java.util.Scanner;

public class ra_14_number_sum_of_digit{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int original = sc.nextInt();
        int n = Math.abs(original);

        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n = n/10;
        }
        if(original < 0) System.out.println("sum of digit: -" + sum);

        else System.out.println("sum of digit: " + sum);
    }
}