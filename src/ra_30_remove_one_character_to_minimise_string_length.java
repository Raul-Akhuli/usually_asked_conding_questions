/*

Problem StatementYou are given a string S consisting of lowercase English letters.
In one move, you can change any single character of the string to any other lowercase English letter.
Your task is to determine the minimum number of moves required to make all characters in the string identical.
Input FormatA single string S of length N1 ≤ N ≤ 10^5S contains only lowercase English letters (a–z)Output FormatPrint a single integer:
the minimum number of moves required.Key Insight (Fastest Logic)To minimize moves:

Keep the most frequent character

Change all other characters

Min Moves=N−(maximum frequency of any character)

Test Cases

Test Case 1

Input
aab

Output
1

Input
abbbc

Output
2

Explanation
Most frequent = b (3 times)
Moves = 5 - 3 = 2

*/








import java.util.Scanner;
import java.util.HashMap;

public class ra_30_remove_one_character_to_minimise_string_length{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        int total = inputLine.length();
        char [] charr = inputLine.toCharArray();

        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : charr){
            freq.put(ch, freq.getOrDefault(ch, 0) +1);
        }

        int max = 0;
        for(int val : freq.values()){
            if(val > max){
                max = val;
            }
        }

        int remaining = total - max;
        System.out.println(remaining);
    }
}



