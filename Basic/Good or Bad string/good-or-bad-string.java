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
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isGoodorBad(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        int v=0;
        int c=0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='a'|| S.charAt(i)=='e'|| S.charAt(i)=='i'|| S.charAt(i)=='o'|| S.charAt(i)=='u'){
                v++;
                c=0;
            }
            else if(S.charAt(i)=='?'){
                v++;
                c++;
            }
            else{
                c++;
                v=0;
            }
            if(c>3||v>5){
                return 0;
            }
        }
        return 1;
    }
}