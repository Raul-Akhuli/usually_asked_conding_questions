import java.util.Scanner;

public class ra_27_string_reverse_a_string{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String [] stringArr = sc.nextLine().trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for(int i = stringArr.length - 1; i >= 0; i--){

            reverse.append(stringArr[i]);

            if( i!= 0) reverse.append(" ");	// my name is raul ---> raul is name my
        }

        System.out.println(reverse);
    }
}
