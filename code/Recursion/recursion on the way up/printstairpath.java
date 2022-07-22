// Print Stair Paths
// Easy

// 1. You are given a number n representing number of stairs in a staircase.
// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
// 3. Complete the body of printStairPaths function - without changing signature - to print the list of all paths that can be used to climb the staircase up.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 0 <= n <= 10

// Format
// Input
// A number n

// Output
// Print paths (one path in each line) in order hinted by Sample output

// Example
// Sample Input

// 3

// Sample Output
// 111
// 12
// 21
// 3

public class printstairpath{
    public static void main(String args[]) {
        int n = 3;
        printStairPath(n,"");
    }

    public static void printStairPath(int n ,String psf){
        if(n<=0){
            if(n==0){
                System.out.println(psf);
            }
            return;
        }


        printStairPath(n-1, psf+1);
        printStairPath(n-2, psf+2);
        printStairPath(n-3, psf+3);
    }
}