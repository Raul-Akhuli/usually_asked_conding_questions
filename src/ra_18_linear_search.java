
import java.util.Scanner;

public class ra_18_linear_search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of an array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("enter the elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if(sc.hasNextLine()) sc.nextLine();   // sc.hasNextLine() check if there is another line of input available in the Scanner buffer or not.
                                              // sc.nextLine() this read and remove the nextLine of input from the buffer.
        System.out.print("enter the element you want to search: ");
        int k = sc.nextInt();

        sc.close();
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                System.out.println("element found at index"+ i);
                return;
            }
        }
        System.out.println("element not found");
    }
}


