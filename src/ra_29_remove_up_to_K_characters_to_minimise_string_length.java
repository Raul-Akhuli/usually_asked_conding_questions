/*

Problem Statement

You are given a string S consisting of lowercase English letters.

In one operation, you may choose one alphabet and remove all its occurrences from the string.

You can perform at most 3 operations.

Determine the minimum possible length of the string that can remain after performing the operations optimally.

Input Format

A single string S

1 ≤ |S| ≤ 10^5

Only lowercase letters (a–z)

Output Format

Print a single integer: minimum remaining length

Key Insight (Fastest Path)

Each operation removes all occurrences of one chosen character

To minimize length, always remove the most frequent characters

Remove up to 3 characters with highest frequencies

Step-by-Step Logic

Count frequency of each character

Sort frequencies in descending order

Remove top 3 frequencies

Subtract their sum from total length


Test Cases


Test Case 1

Input

aabbbcc

Output

0

Explanation
Frequencies: b=3, a=2, c=2
Remove b, a, c → removed 7 characters
Remaining = 7 - 7 = 0

Test Case 2

Input

abcde

Output

2


Explanation
All frequencies = 1
Remove any 3 characters
Remaining = 5 - 3 = 2


*/

import java.util.Scanner;
import java.util.HashMap;

public class ra_29_remove_up_to_K_characters_to_minimise_string_length{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        int total = inputLine.length();
        char [] charr = inputLine.toCharArray();

        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : charr){
            freq.put(ch, freq.getOrDefault(ch, 0) +1);
        }

        int a = 0;
        int b = 0;
        int c = 0;

        // need to import Map and go for it only when you need to Map frequencies with the character otherwise only freq.values() enough to get the frequency.

        for(int val : freq.values()){
            if(val > a){
                c = b;
                b = a;
                a = val;
            }
            else if(val > b){
                c = b;
                b = val;
            }
            else if(val > c){
                c = val;
            }
        }

        int remaning = total - (a+b+c);
        System.out.println(Math.max(0, remaning));
    }
}

