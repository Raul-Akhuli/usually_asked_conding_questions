// longest palindromic substring

import java.util.Scanner;

public class ra_31_string_longest_palindromic_substring {

    public static int start = 0;
    public static int maxlen = 1;

    public static void expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            int currlen = right - left + 1;

            if(currlen > maxlen){
                start = left;
                maxlen = currlen;
            }
            left--;
            right++;
        }
    }

    public static String longestPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n; i++) {

            // odd length palindrome
            expandFromCenter(str, i, i);

            // even length palindrome
            expandFromCenter(str, i, i+1);
        }

        return str.substring(start, (start + maxlen));
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = longestPalindrome(input);

        System.out.println("longest palindromic substring: " + result);

    }
}

