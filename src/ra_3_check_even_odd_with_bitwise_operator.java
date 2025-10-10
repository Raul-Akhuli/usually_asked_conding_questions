import java.util.Scanner;

public class ra_3_check_even_odd_with_bitwise_operator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the no to check to even or odd: ");
        int n = sc.nextInt();

        if((n & 1) == 1) System.out.println("entered number is odd");
        else System.out.println("entered number is even");
    }
}