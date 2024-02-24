//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        //code here
       return sm(n);
        
    } 
    public int sm(int n){
        int sum=0;
        if (n<2||n<3|| n<4 ){
        
        return (n);
            
        }
        
        sum+= (sm(n/2)+sm(n/3)+sm(n/4));
        return Math.max(sum,n);
    }
}
