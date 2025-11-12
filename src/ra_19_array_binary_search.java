import java.util.Scanner;

public class ra_19_array_binary_search {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements in space separated in ascending order: ");

        String inputLine = sc.nextLine();
        String [] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }


        for(int i = 0; i < n - 1; i++){     // should run n-1 time otherwise i+1 exceed the array limit.
            if(arr[i] > arr[i+1]){
                System.out.println("Error: array must be sorted in ascending order.");           // check it is ascending or not.
                return;
            }
        }



        System.out.print("enter the element to search: ");
        int k = sc.nextInt();

        sc.close();

        int left = 0;
        int right = n-1;

        while(left <= right){   // '<=' active the loop while left == right
            int mid = left + (right - left)/2; //to stop the overflow, condition where left = 2000000000 and right is 2000000010 I mean very big.

            if(k == arr[mid]){
                System.out.println("element present at index: "+ mid);
                return;
            }
            else if(k < arr[mid]){
                right = mid-1;
            }
            else left = mid+1;
        }
        System.out.println("element not present.");
    }
}
