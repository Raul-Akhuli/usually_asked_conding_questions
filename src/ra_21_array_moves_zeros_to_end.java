import java.util.Scanner;

public class ra_21_array_moves_zeros_to_end {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the element space separated: ");
        String inputLine = sc.nextLine();
        String [] stringArray = inputLine.split("\\s+");
        int n = stringArray.length;

        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringArray[i]);
        }

        int index = 0;


        for(int i = 0; i < n; i++){
            if(arr[i] != 0) arr[index++] = arr[i];
        }

        while(index < n){
            arr[index++] = 0;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

