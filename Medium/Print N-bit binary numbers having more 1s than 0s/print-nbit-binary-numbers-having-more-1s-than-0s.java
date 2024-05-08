//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<String> ans;
    Solution(){
        this.ans = new ArrayList<>();
    }
    ArrayList<String> NBitBinary(int n) {
        solve(0,0,"",n);
        return ans;
    }
    public static void solve(int one,int zero,String str,int n){
        if(n==0){
            ans.add(str);
            return;
        }
        solve(one+1,zero,str+"1",n-1);
        if(one>zero){
            solve(one,zero+1,str+"0",n-1);
        }
    }
}