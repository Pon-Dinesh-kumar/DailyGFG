//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.recamanSequence(n);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        int prev = 0, res = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        int i=0;
        while(++i<n){
            res = prev - i;
            if(res<0 || arr.contains(res)){
                res = prev + i;
            }
            arr.add(res);
            prev = res;
        }
        return arr;
    }
}