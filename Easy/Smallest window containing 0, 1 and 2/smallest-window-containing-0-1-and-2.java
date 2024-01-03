//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        int n = S.length();
        int[] count = new int[3];
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int uniqueCount = 0;

        while (right < n) {
            char currentChar = S.charAt(right);

            if (count[currentChar - '0'] == 0) {
                uniqueCount++;
            }

            count[currentChar - '0']++;

            while (uniqueCount == 3) {
                minLength = Math.min(minLength, right - left + 1);

                char leftChar = S.charAt(left);
                count[leftChar - '0']--;

                if (count[leftChar - '0'] == 0) {
                    uniqueCount--;
                }

                left++;
            }

            right++;
        }

        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
    
}