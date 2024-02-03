//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDivisible(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDivisible(int N) {
        if(N%sum(N)==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    int sum(int n){
        if(n<=9){
            return n;
        }
        else{
           return (sum(n/10)+n%10); 
        } 
    }
};