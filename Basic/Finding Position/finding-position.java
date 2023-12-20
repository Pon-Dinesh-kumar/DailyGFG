//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthPosition(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static long nthPosition(long n){
        if (n <= 0) {
            return -1; // Handle invalid input
        }

        // Finding the highest power of 2 less than or equal to n
        long position = 1;
        while (position * 2 <= n) {
            position *= 2;
        }

        return position;
    }
}
