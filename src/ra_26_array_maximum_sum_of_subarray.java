// maximum sum of subarray

import java.util.Scanner;

public class ra_26_array_maximum_sum_of_subarray{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String [] stringArr = inputLine.split("\\s+");
        int n = stringArr.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < n; i++){
            current_sum = Math.max (arr[i], arr[i] + current_sum);       // compare based on the arr[i]
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println(max_sum);
        sc.close();
    }
}



