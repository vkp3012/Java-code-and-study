public class cuttingrod {
    

    public static int cutRod(int price[], int n) {
        //code here
        
        // code here
        int w = price.length;
        int dp[][] = new int[n+1][w+1];
        
        // for(int a[]: dp){  
        //     Arrays.fill(a,-1);
        // }
        
        //   return helper(n,W,val,wt,dp);
    
        // //tabulation part..
        // for(int a[]: dp){
        //     Arrays.fill(a,0);
        // }
        
        for(int i = 0;i<=w;i++){
            for(int j = 0;j<=n;j++){
                if( i == 0 || j == 0){
                    dp[i][j] = 0;
                // }else if(i <= j){
                //     int include = dp[i][j-1] + price[i-1];
                //     int exclude = dp[i-1][j];
                //     dp[i][j] = Math.max(include,exclude);
                }else{
                    dp[i][j] = dp[i-1][j];
                    if(i<=j)
  			    	dp[i][j]=Math.max(dp[i][j], price[i-1]+dp[i][j-i]);
                }
            }
        }
        
        return dp[n][w];
    }


    public static void main(String args[]){
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = price.length;

        int ans = cutRod(price,n);
        System.out.println(ans);
    }
}
