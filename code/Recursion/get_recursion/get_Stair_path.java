package get_recursion;

import java.util.ArrayList;

// Get Stair Paths
// Easy

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= n <= 10

// Format
// Input
// A number n

// Output
// Contents of the arraylist containing paths as shown in sample output

// Example
// Sample Input

// 3

// Sample Output
// [111, 12, 21, 3]


public class get_Stair_path{

    public static void main(String args[]){
        int n = 3;

        ArrayList<String>str = getStairPath(n);

        System.out.println(str);
    }

    public static ArrayList<String> getStairPath(int n){
        if(n == 0){
            ArrayList<String>base1 = new ArrayList<>();
            base1.add("");
            return base1;
        }


        if(n < 0){
            ArrayList<String>base2 = new ArrayList<>();
            return base2;
        }

        //faith-1 in step 1
        ArrayList<String> path1 = getStairPath(n-1);
        //faith-2 in step 2
        ArrayList<String> path2 = getStairPath(n-2);
        //faith-3 in step 3
        ArrayList<String> path3 = getStairPath(n-3);

        ArrayList<String>ans = new ArrayList<>();

        for(int i = 0;i<path1.size();i++){
            ans.add("1" + path1.get(i));
        }
        for(int i = 0;i<path2.size();i++){
            ans.add("2" + path2.get(i));
        }
        for(int i = 0;i<path3.size();i++){
            ans.add("3" + path3.get(i));
        }

        return ans;
    }
}