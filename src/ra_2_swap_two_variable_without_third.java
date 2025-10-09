import java.util.Scanner;

public class ra_2_swap_two_variable_without_third{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("enter the value of b: ");
        int b = sc.nextInt();


        // arithmetic operator.
        //a = a+b;
        //b = a-b;
        //a = a-b;

        // bitwise operator.
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("value of a is " + a + " value of b is: " + b);
    }
}