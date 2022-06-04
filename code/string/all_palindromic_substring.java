// Print All Palindromic Substrings
// Easy

// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

// Constraints
// 1 <= length of string <= 500

// Format
// Input
// A String

// Output
// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

// Example
// Sample Input

// abcc

// Sample Output
// a
// b
// c
// cc
// c


public class all_palindromic_substring{

    public static void solution(String s1){

        for(int i = 0;i<s1.length();i++){
            for(int j = i+1;j<=s1.length();j++){
                String sub = s1.substring(i,j);

                boolean isPalindromic = ispalindroic(sub);

                if(isPalindromic == true){
                    System.out.println(sub);
                }
            }
        }
    }


    public static boolean ispalindroic(String st){
        boolean flag = true;
        int left = 0;
        int right = st.length() - 1;

        while(left<right){
            char charleft = st.charAt(left);
            char charright = st.charAt(right);
            if(charleft != charright){
                return false;

            }
            left++;
            right--;
        }

        return flag;
    }

    public static void main(String args[]){
        String s1 = "ab";
        solution(s1);
    }

}
