import java.util.Scanner;

public class ra_6_number_palindrome_or_not{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to check palindrome or not: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;

        while(n != 0){
            int digit = n % 10;
            reverse = reverse *10 + digit;
            n = n / 10;
        }

        if(reverse == original) System.out.println("entered number is palindrome");
        else System.out.println("entered number is not palindrome");

        sc.close();
    }
}
