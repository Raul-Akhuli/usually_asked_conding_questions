import java.util.Scanner;

public class ra_5_numbers_prime_or_not{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to check prime or not: ");
        int n = sc.nextInt();

        if(n < 2){
            System.out.println("entered number is not prime.");
            return;
        }

        /*
        if you want to skip even numbers 😁

        if(n % 2 == 0){
            System.out.println(n == 2 ? "entered number is prime." : "entered number is not prime.");
            return;
        }

        then modify the loop 😁

        for(int i = 3; i*i <= n; i+=2){

        }
         */
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) {
                System.out.println("entered number is not prime.");
                return;
            }
        }
        System.out.println("entered number is prime.");

        sc.close();
    }
}