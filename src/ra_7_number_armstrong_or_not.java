import java.util.Scanner;

public class ra_7_number_armstrong_or_not{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to check armstrong or not: ");
        int n = sc.nextInt();
        int original = n;
        int checkNumber = 0;

        while(n != 0){
            int remainder = n % 10;
            int qube = (int) Math.pow(remainder, 3);	// in java  '^' is not power operator it XOR oparater;
            checkNumber += qube;
            n = n /10;
        }
        if(original == checkNumber) System.out.println("entered number is armstrong number.");
        else System.out.println("entered number is not armstrong number");
    }
}