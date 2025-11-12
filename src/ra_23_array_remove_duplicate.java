import java.util.Scanner;
import java.util.LinkedHashSet;

public class ra_23_array_remove_duplicate{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        String [] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        LinkedHashSet<Integer> removeDuplicate = new LinkedHashSet<>();
        for(int num : arr){
            removeDuplicate.add(num);
        }
        System.out.println(removeDuplicate);
    }
}
