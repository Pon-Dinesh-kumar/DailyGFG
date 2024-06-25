//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static Long reversedBits(Long x) {
        int arr[] = new int[32];
        
        int i = 0;
        
        while(x!=0){
            if((x&1)==1){
                arr[i] = 1;
            }
            i++;
            x>>=1;
        }
        
        int p = 0;
        long ans = 0;
        for(int j =31;j>=0;j--){
            if(arr[j]==1){
                ans+= (long) Math.pow(2,p);
            }
            p++;
        }
        
        return ans;
    }
};