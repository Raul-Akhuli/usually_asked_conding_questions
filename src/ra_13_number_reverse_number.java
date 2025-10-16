import java.util.Scanner;

public class ra_13_number_reverse_number{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = sc.nextInt();

        int digit = 0;
        int reverse = 0;

        while(n > 0){
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        System.out.println("reserse no is: " + reverse);
    }
}