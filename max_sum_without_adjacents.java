class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        int dp[] = new int[n];
        
        dp[0] = arr[0];
        
        for(int i=1;i<n;i++)
        {
            int incl = arr[i] + (i>=2?dp[i-2]:0);
            int excl = dp[i-1] + 0;
            dp[i] = Math.max(incl,excl);
        }
        
        return dp[n-1];
        
    }
    
}
