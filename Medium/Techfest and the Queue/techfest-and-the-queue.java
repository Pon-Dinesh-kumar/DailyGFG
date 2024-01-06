//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long sumOfPowers(long a, long b) {
        long result = 0;
        for (long i = a; i <= b; i++) {
            result += countPrimePowers(i);
        }
        return result;
    }

    private static int countPrimePowers(long num) {
        int count = 0;
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }

        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                count++;
                num /= i;
            }
        }

        if (num > 1) {
            count++;
        }

        return count;
    }
}



        
