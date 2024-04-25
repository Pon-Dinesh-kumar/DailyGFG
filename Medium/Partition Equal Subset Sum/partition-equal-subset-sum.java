//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    /* RECURSIVE IDEA: 
    public boolean check(int total,int n,int arr[],int sum){
        if(n==0){
            return (total==sum/2) ;
        }
        
        return check(total-arr[n-1],n-1,arr,sum)||check(total,n-1,arr,sum);
    }
    public boolean findPartition(int[] a, int n){
        int res=0;
        for(int i=0;i<n;i++){
            res+=a[i];
        }
        if(res%2==1){
            return false;
        }
        return check(res,n,a,res);
    }
    */
    
    static int equalPartition(int n, int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2==1){
            return 0;
        }
        
        int prev[]=new int[sum+1];
        
        for(int i=0;i<n;i++){
            int curr[]=new int[sum+1];
            curr[arr[i]]=1;
            for(int j=1;j<=sum;j++){
                if(prev[j]==1){
                    curr[j]=1;
                    curr[j+arr[i]]=1;
                }
            }
            prev=curr;
        }
        
        if(prev[sum]==1 && prev[sum/2]==1){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}