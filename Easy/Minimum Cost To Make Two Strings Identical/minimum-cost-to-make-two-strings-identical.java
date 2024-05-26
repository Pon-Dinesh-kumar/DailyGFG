//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String X = sc.next();
            String Y = sc.next();
            int costX = sc.nextInt();
            int costY = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.findMinCost(X, Y, costX, costY));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int find(String s1,String s2,int i1,int i2,int[][] dp){
        if(i1 < 0 || i2 < 0) return 0;
        if(dp[i1][i2] != -1) return dp[i1][i2];
        
        if(s1.charAt(i1) == s2.charAt(i2)){
            return dp[i1][i2] = 1 + find(s1,s2,i1-1,i2-1,dp);
        }
        
        return dp[i1][i2] = 0 + Math.max(find(s1,s2,i1-1,i2,dp),find(s1,s2,i1,i2-1,dp));
    }
    public int findMinCost(String x, String y, int costX, int costY) {
        int n1 = x.length();
        int n2 = y.length();
        int[][] dp = new int[n1][n2];
        for(int[] temp:dp){
            Arrays.fill(temp,-1);
        }
        int lcs = find(x,y,n1-1,n2-1,dp);
        return (n1-lcs)*costX + (n2-lcs)*costY;
    }
}