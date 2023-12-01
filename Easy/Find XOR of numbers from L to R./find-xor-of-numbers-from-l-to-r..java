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

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        int xorl = 0;
        int xorr =0;
        
        l=l-1;
        
        if(l%4==0){
            xorl=l;
        }
        else if(l%4==1){
            xorl=1;
        }
        else if(l%4==2){
            xorl=1+l;
        }
        else{
            xorl=0;
        }
        
        
        if(r%4==0){
            xorr=r;
        }
        else if(r%4==1){
            xorr=1;
        }
        else if(r%4==2){
            xorr=1+r;
        }
        else{
            xorr=0;
        }
        
        return xorr^xorl;
    }
}