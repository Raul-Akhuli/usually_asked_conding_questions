/*
Harshad numbers, also known as Niven numbers, 
are integers that are divisible by the sum of their digits 
when expressed in a given base. For example, 
the number 18 is a Harshad number in base 10 
because the sum of its digits (1 + 8 = 9) divides 18 evenly.

*/


import java.util.Scanner;

public class ra_10_number_harshad_also_niven_or_not{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to check harshad or not: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while(n > 0){
            sum += n % 10;

            n = n /10;
        }
        if(original % sum == 0) System.out.println("entered number is harshad number");
        else System.out.println("entered number is not a harshad number");
    }
}