import java.util.Scanner;

public class ra_20_bubble_sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String [] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        for(int j = 0; j < n-1; j++){
            for(int i = 0; i < n-j-1; i++){
                if(arr[i] > arr[i+1]){
                    arr[i] = arr[i] + arr[i+1];
                    arr[i+1] = arr[i] - arr[i+1];     // this swaping techniqe is problemetic in case of large numbers
                    arr[i] = arr[i] - arr[i+1];       // for large numbers follow the conventional method mean with the help of extra variable.
                }
            }

        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

