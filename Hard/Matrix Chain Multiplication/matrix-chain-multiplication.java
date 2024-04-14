//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
       static void fillTable(int[][] m, int[][] s, int i, int j, int[] d, int n) {
        int minCost = Integer.MAX_VALUE;
        int cost, sValue = 0;

        for (int k = i; k < j; k++) {
            cost = m[i][k] + m[k + 1][j] + d[i - 1] * d[k] * d[j];
            if (cost < minCost) {
                minCost = cost;
                sValue = k;
            }
        }

        s[i][j] = sValue;
        m[i][j] = minCost;
    }
    
    static int matrixMultiplication(int N, int arr[])
    {
        int n = N-1; // no. of matrices
        

        int[][] m = new int[n + 1][n+1];
        int[][] s = new int[n + 1][n+1];

        for (int a = 1; a <= n; a++) {
            m[a][a] = 0;
        }

        int gap = 1;
        while (gap < n) {
            int i = 1;
            int j = i + gap;
            while (j <= n) {
                fillTable(m, s, i, j, arr, n);
                i++;
                j++;
            }
            gap++;
        }

        return m[1][n];
    }
} 