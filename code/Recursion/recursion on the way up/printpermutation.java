// Print Permutations
// Easy

// 1. You are given a string str.
// 2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
// Use sample input and output to take idea about permutations.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= str.length <= 7

// Format
// Input
// A string str

// Output
// Permutations of str in order hinted by Sample output

// Example
// Sample Input

// abc

// Sample Output
// abc
// acb
// bac
// bca
// cab
// cba


public class printpermutation{
    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str,"");
    }

    public static void printPermutation(String str,String asf){

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            String roc = str.substring(0, i) + str.substring(i+1);
            printPermutation(roc, asf+ch);
        }

    }
}