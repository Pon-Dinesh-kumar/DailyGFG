//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
    public static long[] productExceptSelf(int nums[], int n) 
    { 
        // code here
        long arr[] = new long[n];
        for(int i = 0 ; i < n; i++){
            long p = 1;
            for(int j = 0 ; j < n ;j++){
                if(j == i && i != n-1){
                    j++;
                }
                if( i == n-1 && j == n-1){
                arr[i] = p;
                    return arr;
                }
                 p *= nums[j];
                arr[i] = p;
            }
        }
        return arr;
    } 
}