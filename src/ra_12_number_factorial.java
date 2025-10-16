import java.util.Scanner;

public class ra_12_number_factorial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no to calculate factorial: ");
        int n = sc.nextInt();
        long fact = 1;       // take long for the bigger value

        if(n < 0){
            System.out.println("invalid input");
            sc.close();            // close the scanner.
            return;
        }

        for(int i = 1; i <= n; i++){
            fact = fact*i;
        }
        System.out.println("\nfactorial value is: " + fact);     // if user enter 0 fact value is already 1.
    }
}