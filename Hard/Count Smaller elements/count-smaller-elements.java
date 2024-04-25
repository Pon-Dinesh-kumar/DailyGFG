//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int[] constructLowerArray(int[] arr, int n) {
        
        int[] result = new int[n];
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        mergeSort(arr, indexes, result, 0, n - 1);
        return result;
        // code here
    }
    private void mergeSort(int[] arr, int[] indexes, int[] result, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, indexes, result, start, mid);
        mergeSort(arr, indexes, result, mid + 1, end);
        merge(arr, indexes, result, start, mid, end);
    }

    private void merge(int[] arr, int[] indexes, int[] result, int start, int mid, int end) {
        int[] tempIndexes = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int rightCount = 0;
        int index = 0;
        while (left <= mid && right <= end) {
            if (arr[indexes[right]] < arr[indexes[left]]) {
                tempIndexes[index++] = indexes[right++];
                rightCount++;
            } else {
                tempIndexes[index++] = indexes[left];
                result[indexes[left++]] += rightCount;
            }
        }
        while (left <= mid) {
            tempIndexes[index++] = indexes[left];
            result[indexes[left++]] += rightCount;
        }
        while (right <= end) {
            tempIndexes[index++] = indexes[right++];
        }
        System.arraycopy(tempIndexes, 0, indexes, start, tempIndexes.length);
    }
}

