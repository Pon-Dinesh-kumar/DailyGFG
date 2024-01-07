//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        int low = getMax(arr, N);
        int high = getSum(arr, N);

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isValid(arr, N, K, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static boolean isValid(int[] arr, int N, int K, int maxSum) {
        int partitions = 1;
        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                partitions++;
                currentSum = arr[i];

                if (partitions > K) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int getMax(int[] arr, int N) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    private static int getSum(int[] arr, int N) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
