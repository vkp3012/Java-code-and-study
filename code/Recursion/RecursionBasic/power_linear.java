// Power-linear
// Easy

// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Constraints
// 1 <= x <= 10
// 0 <= n <= 9

// Format
// Input
// A number x
// A number n

// Output
// x raised to the power n

// Example
// Sample Input

// 2
// 5

// Sample Output
// 32
package RecursionBasic;

public class power_linear{

    public static void main(String args[]){
        int x = 2;
        int n = 5;

        int result = powerLinear(x, n);
        System.out.print(result);
    }

    public static int powerLinear(int x,int n){
        if(n == 0){
            return 1;
        }

        int pow = powerLinear(x, n-1);

        int ans = pow*x;

        return ans;

    }
}
