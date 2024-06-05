//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        long asum = 0;
        long bsum = 0;
        HashSet<Long> aset = new HashSet<>();  // Changed Integer to Long
        HashSet<Long> bset = new HashSet<>();  // Changed Integer to Long
        
        for (int i = 0; i < n; i++) {
            asum += a[i];
            aset.add(a[i]);  // No change needed here
        }
        
        for (int i = 0; i < m; i++) {
            bsum += b[i];  // Changed from a[i] to b[i]
            bset.add(b[i]);  // No change needed here
        }
        
        if (asum > bsum) {
            long diff = asum - bsum;  // No change needed here
            for (int i = 0; i < m; i++) {
                long atemp = asum;
                long btemp = bsum;
                btemp -= b[i];
                atemp += b[i];
                long temp = atemp - btemp;
                if (temp % 2 == 0) {
                    if (aset.contains(temp / 2)) {  // Changed tem to temp
                        return 1;
                    }
                }
            }
        } else if (bsum > asum) {
            long diff = bsum - asum;  // No change needed here
            for (int i = 0; i < n; i++) {
                long btemp = bsum;
                long atemp = asum;
                atemp -= a[i];
                btemp += a[i];
                long temp = btemp - atemp;
                if (temp % 2 == 0) {
                    if (bset.contains(temp / 2)) {  // Changed tem to temp
                        return 1;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (bset.contains(a[i])) {
                    return 1;
                }
            }
        }
        
        return -1;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int m = Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a, n, b, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends