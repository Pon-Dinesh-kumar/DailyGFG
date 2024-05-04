//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.Maximize(a,n));
        }
        
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    
    int Maximize(int arr[], int n)
    {
       
         Arrays.sort(arr);
        
        // Initialize result
        long result = 0;

        // Calculate the maximum value
        for (int i = 0; i < n; i++) {
            result += (long)arr[i] * i;
            result %= 1000000007; // Take modulo to prevent overflow
        }
        
        return (int)result;
    }   
}
