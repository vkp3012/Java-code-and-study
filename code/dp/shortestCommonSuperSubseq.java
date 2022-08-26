import java.util.Arrays;

// Shortest Common Supersequence

// Given two strings X and Y of lengths m and n respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.
// Note: X and Y can have both uppercase and lowercase letters.

// Example 1

// Input:
// X = abcd, Y = xycd
// Output: 6
// Explanation: Shortest Common Supersequence
// would be abxycd which is of length 6 and
// has both the strings as its subsequences.
// Example 2

// Input:
// X = efgh, Y = jghi
// Output: 6
// Explanation: Shortest Common Supersequence
// would be ejfghi which is of length 6 and
// has both the strings as its subsequences.
// Your Task:
// Complete shortestCommonSupersequence() function that takes X, Y, m, and n as arguments and returns the length of the required string.

// Expected Time Complexity: O(Length(X) * Length(Y)).
// Expected Auxiliary Space: O(Length(X) * Length(Y)).


public class shortestCommonSuperSubseq {

    public static int helper(String x,String y){

        int n = x.length();
        int m = y.length();

        int dp[][] = new int[n+1][m+1];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }

        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        return n+m-dp[n][m];

        
    }
    
    public static void main(String args[]) {
        
        String x = "abcd";
        String y = "xycd";

        int len = helper(x,y);
        System.out.println(len);
    }
}
