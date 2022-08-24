import java.util.Arrays;

// Longest Common Substring 

// Given two strings. The task is to find the length of the longest common substring.


// Example 1:

// Input: S1 = "ABCDGH", S2 = "ACDGHR", n = 6, m = 6
// Output: 4
// Explanation: The longest common substring
// is "CDGH" which has length 4.

// Example 2:

// Input: S1 = "ABC", S2 "ACB", n = 3, m = 3
// Output: 1
// Explanation: The longest common substrings
// are "A", "B", "C" all having length 1.

// Your Task:
// You don't need to read input or print anything. 
//Your task is to complete the function longestCommonSubstr() which takes the string S1, 
// string S2 and their length n and m as inputs and returns the length of the longest common substring in S1 and S2.


public class longestCommonSubstring{

    public static int helper(String t1,String t2,int n ,int m){

        int dp[][] = new int[n+1][m+1];
        for(int a[] : dp){
            Arrays.fill(a,-1);
        }

        int ans = 0;
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=m;j++){
                if( i == 0 || j==0){
                    dp[i][j] = 0;
                }else if(t1.charAt(i-1) == t2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    ans = Math.max(ans,dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        String t1 = "ABCDGH";
        String t2 = "ACDGHR";

        int n = t1.length();
        int m = t2.length();

        int ans = helper(t1,t2,n,m);
        System.out.println(ans);

    }
}