// eg: "I am coder" --> "I ma redoc"




import java.util.Scanner;

public class ra_28_reverse_a_string_word{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine().trim();
        sc.close();

        String [] stringArr = inputLine.split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < stringArr.length; i++){
            String temp = stringArr[i];
            char [] charr = temp.toCharArray();
            StringBuilder tempresult = new StringBuilder();

            for(int j = charr.length - 1; j >=0;  j--){
                tempresult.append(charr[j]);
            }
            result.append(tempresult);

            if(i != stringArr.length - 1){
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}

