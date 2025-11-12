
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ra_22_array_find_unique_element_in_array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String [] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        boolean flag = false;                                    // in case no unique element present
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int i = 0; i < n; i++){
            if(freq.getOrDefault(arr[i], 0) == 1){
                System.out.print(arr[i] + " ");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("no unique element present");
        }
        sc.close();
    }
}



