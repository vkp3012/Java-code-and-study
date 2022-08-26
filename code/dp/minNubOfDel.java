// Minimum number of deletions.

// Given a string 'str' of size ‘n’. The task is to remove or delete the minimum number of characters from the string so that the resultant string is a palindrome. Find the minimum numbers of characters we need to remove.
// Note: The order of characters should be maintained.

// Example 1:

// Input: n = 7, str = "aebcbda"
// Output: 2
// Explanation: We'll remove 'e' and
// 'd' and the string become "abcba".
// â€‹Example 2:

// Input: n = 3, str = "aba"
// Output: 0
// Explanation: We don't remove any
// character.
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function minDeletions() which takes the string s and length of s as inputs and returns the answer.

public class minNubOfDel {

    public static int helper(String s,int n){

        int dp[][] = new int[n][n];

        for(int gap = 0;gap<n;gap++){
            for(int i = 0,j = gap;j<n;j++,i++){
                if(i >= j){
                    dp[i][j] = (i == j) ? 1:0;
                    continue;
                }else if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]  + 2;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }

        return (n - dp[0][n-1]);
    }
    
    public static void main(String args[]) {
        String s = "aebcbda";
        int n = 7;

        int ans = helper(s,n);

        System.out.println(ans);
    }
}
