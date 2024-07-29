//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        int rowNum=-1;
        int maxOnes=Integer.MIN_VALUE;
        int firstOccurence=Integer.MAX_VALUE;
        int cur=0;
        int firstCol=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
             if(arr[i][arr[0].length-1]==0 || j>=firstCol)
                break;
                    
              if(arr[i][j]==1)
              {
                 firstCol=Math.min(firstCol,j);
                 cur=arr[0].length-j;
                 if(cur>maxOnes)
                 {
                    rowNum=i;
                    maxOnes=cur;
                 }
              }
            }
        }
        return rowNum;
    }
}

