//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static final int MOD = 1000000007;

    public int TotalWays(int N) {
        long[] dpBuildings = new long[N + 1];
        long[] dpSpaces = new long[N + 1];

        dpBuildings[1] = 1;
        dpSpaces[1] = 1;

        for (int i = 2; i <= N; i++) {
            dpBuildings[i] = (dpSpaces[i - 1] + dpBuildings[i - 1]) % MOD;
            dpSpaces[i] = dpBuildings[i - 1];
        }

        long totalWays = (dpBuildings[N] + dpSpaces[N]) % MOD;
        return (int) ((totalWays * totalWays) % MOD);
    }
}
