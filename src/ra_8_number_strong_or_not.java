// 145 = 1! +4! + 5! = 145

import java.util.Scanner;

public class ra_8_number_strong_or_not{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number to check it is strong or not: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        int [] factorial = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880}; // only 9 digit present.
        while(n != 0){
            int digit = n % 10;
            reverse += factorial[digit];      // reverse += factorial[n % 10];
            n = n/10;
        }
        if(original == reverse)System.out.println("entered number is strong number");
        else System.out.println("entered number is not strong");

        sc.close();
    }
}