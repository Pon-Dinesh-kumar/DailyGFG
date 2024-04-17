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
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
 
    int getCount(int matrix[][],int target){
           
           int count = 0;
           
           for(int i=0; i < matrix.length; ++i){
               
                int l=0;
                int r=matrix[i].length-1;
                int res = -1;
                
                while( l <= r ){  
                     
                     int mid = (l + (r-l)/2);
                     
                     if( matrix[i][mid] <= target ){
                         res = mid;
                         l = mid + 1;
                     }
                     else {
                          r = mid - 1;
                     }
  
                }
                
                count += (res + 1);
                
           }
          
          return count;
          
    }
    
    int median(int matrix[][],int R,int C) {
        
        // code here        
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for(int[] m :matrix){
            for(int val : m){
              l = Math.min(val,l);
              r = Math.max(val,r);
            }
         }
        
        int required = ((R*C)/2); // R*C is always odd
        int res = -1;
        
        while ( l <= r ){
            
            int mid = (l + (r-l)/2);
            
            int count = getCount(matrix,mid);
            
            if( count <= required ){
                l = mid + 1;
            }
            else {
                res = mid;
                r = mid - 1;   
            }
            
        }
        
        return res;
        
    }
}