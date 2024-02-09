//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long numberOfPath(int N, int K, int [][]arr) {
        // code here
        long dp[][][] = new long[N][N][K+1];
        if(arr[0][0]<=K)
        dp[0][0][arr[0][0]] = 1;
        int hr_sum = arr[0][0];
        int dig_sum = arr[0][0];
        for(int i=1;i<N;i++) {
            hr_sum += arr[0][i];
            dig_sum += arr[i][0];
            if(hr_sum<=K)
            dp[0][i][hr_sum] = 1;
            if(dig_sum<=K)
            dp[i][0][dig_sum] = 1;
        }
        
        for(int i=1;i<N;i++) {
            for(int j=1;j<N;j++) {
                for(int k=1;k<=K;k++) {
                    if(arr[i][j]+k<=K)
                    dp[i][j][arr[i][j]+k] = dp[i-1][j][k] + dp[i][j-1][k];
                }
            }
        }
        return dp[N-1][N-1][K];
    }
}

