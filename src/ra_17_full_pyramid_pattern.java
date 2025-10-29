import java.util.Scanner;

public class ra_17_full_pyramid_pattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i > 0; i--){
            for(int j = n-i; j > 0; j--){
                System.out.print("  ");
            }
            for(int j = 2*i-1; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
