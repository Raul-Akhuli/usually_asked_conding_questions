import java.util.Scanner;

public class ra_1_swap_two_variable_with_third{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("enter the value of b: ");
        int b = sc.nextInt();

        int temp = b;
        b = a;
        a = temp;

        System.out.println("value of a is " + a + " value of b is: " + b);
    }
}