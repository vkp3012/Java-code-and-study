package get_recursion;

import java.util.ArrayList;

// Get Subsequence
// Easy

// 1. You are given a string str. 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences. Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


// Constraints
// 0 <= str.length <= 20


// Format
// Input
// A string str


// Output
// Contents of the arraylist containing subsequences as shown in sample output


// Example
// Sample Input

// abc

// Sample Output
// [, c, b, bc, a, ac, ab, abc]


public class getSubsequece{
    public static void main(String args[]){
        String str = "abc";

        ArrayList<String>ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str){

        if(str.length() == 0){
            ArrayList<String>base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String roc = str.substring(1 );


        ArrayList<String>rr = gss(roc);

        ArrayList<String>myans = new ArrayList<>();

        for(String rstr : rr){
            myans.add(rstr);
        }

        for(int i = 0; i < rr.size() ; i++){
            myans.add(ch + rr.get(i));
        }

        return myans;

    }
}