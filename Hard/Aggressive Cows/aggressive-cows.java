//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean isvalid(int[] st,int n,int k,int mid){
        int cow=1;
        int last=st[0];
        for(int i=1; i<n; i++){
            if(st[i]-last>=mid){
                cow++;
                last=st[i];
            }
        }
        
        if(cow>=k){
            return true;
        }
        
        return false;
        
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1];
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(isvalid(stalls,n,k,mid)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}