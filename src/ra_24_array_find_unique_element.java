//find duplicate element

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class ra_24_array_find_unique_element{
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

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }
    }
}



