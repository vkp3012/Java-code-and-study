// Print Subsequence
// Easy

// 1. You are given a string str.
// 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= str.length <= 7

// Format
// Input
// A string str

// Output
// Subsequences of str in order hinted by Sample output

// Example
// Sample Input

// yvTA

// Sample Output
// yvTA
// yvT
// yvA
// yv
// yTA
// yT
// yA
// y
// vTA
// vT
// vA
// v
// TA
// T
// A


public class printSubsequence{

    public static void main(String args[]) {
        String str = "yvTA";

        printss(str, "");
    }

    public static void printss(String str,String asf){

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        String roc = str.substring(1);

        printss(roc, asf+ch);
        printss(roc, asf);
    }
}