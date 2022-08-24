import java.util.Arrays;

// 1143. Longest Common Subsequence
// Medium

// 7909

// 89

// Add to List

// Share
// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.

 

// Example 1:

// Input: text1 = "abcde", text2 = "ace" 
// Output: 3  
// Explanation: The longest common subsequence is "ace" and its length is 3.
// Example 2:

// Input: text1 = "abc", text2 = "abc"
// Output: 3
// Explanation: The longest common subsequence is "abc" and its length is 3.
// Example 3:

// Input: text1 = "abc", text2 = "def"
// Output: 0
// Explanation: There is no such common subsequence, so the result is 0.


public class longestCommomSunseq{

    public static int helper(String t1,String t2,int n, int m,int dp[][]){

        if(n == 0 || m == 0){
            return dp[n][m] = 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(t1.charAt(n-1) == t2.charAt(m-1)){
            return dp[n][m] = helper(t1,t2,n-1,m-1,dp)+1;
        }else{
            return dp[n][m] = Math.max(helper(t1,t2,n,m-1,dp),helper(t1,t2,n-1,m,dp));
        }
    }

    public static int longestCommonSubsequence(String t1,String t2){
        int n = t1.length();
        int m = t2.length();

        int dp[][] = new int[n+1][m+1];

        //using dp
        // for(int a[] : dp){
        //     Arrays.fill(a, -1);
        // }

        // return helper(t1,t2,n,m,dp);


        //tabulation

        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(t1.charAt(i-1) == t2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String args[]) {
        
        String t1 = "abcde";
        String t2 = "ace";
        
        int ans = longestCommonSubsequence(t1,t2);
        System.out.println(ans);
    }
}