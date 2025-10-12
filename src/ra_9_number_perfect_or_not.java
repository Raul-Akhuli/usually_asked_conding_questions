// 6 has proper divisors 1, 2, and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number. 
// The next perfect number is 28, because 1 + 2 + 4 + 7 + 14 = 28.
// The first seven perfect numbers are 6, 28, 496, 8128, 33550336, 8589869056, and 137438691328

import java.util.Scanner;

public class ra_9_number_perfect_or_not{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number to check it perfect or not: ");
        int n = sc.nextInt();
        System.out.println();
        int original1 = n;
        int sum = 1;      // ekta divisor to 1 hotei hobe vai 😁

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) sum += i;
        }
        if(original1 == sum) System.out.println("entered number is perfect.");
        else System.out.println("entered number is not perfect.");
    }
}