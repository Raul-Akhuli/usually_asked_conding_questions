// frequency of each element in array

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class ra_25_array_frequency_of_each_element{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String [] stringArr = inputLine.split("\\s+");
        int n = stringArr.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArr[i]);
        }

        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element : Frequency");
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
