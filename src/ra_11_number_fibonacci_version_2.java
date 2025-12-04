
import java.util.Scanner;

public class ra_11_number_fibonacci_version_2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of element: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci series: ");
        for(int i = 1; i <= n; i++){
            System.out.print( a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
        sc.close();
    }
}


