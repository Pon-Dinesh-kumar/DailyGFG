//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution{
    static int mod = (int)1e9 + 7;
    
    static int nCr(int n, int r)
    {
        // code here
         if (r > n)
            return 0;
        int[] prev = new int[r + 1];
        int[] curr = new int[r + 1];
        prev[0] = curr[0] = 1;
        if (r == n || r == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= r; j++) {
                curr[j] = (prev[j - 1] + prev[j]) % mod;
            }
            prev = curr.clone();
        }
        return prev[r];
    }
}