//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int t = 0; t < testCases; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            ArrayList<Integer> A = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                A.add(arr[i]);
            }

            ArrayList<ArrayList<Integer>> res = new Solution().subsets(A);
            for (int i = 0; i < res.size(); i++) {
                for (int j = 0; j < res.get(i).size(); j++) {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
            // System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : a) {
            int currentSize = outer.size();
            for (int j = 0; j < currentSize; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(num);
                outer.add(inner);
            }
        }
        
        // Then sort all subsets lexicographically
        outer.sort((list1, list2) -> {
            int size = Math.min(list1.size(), list2.size());
            for (int i = 0; i < size; i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    return list1.get(i) - list2.get(i);
                }
            }
            return Integer.compare(list1.size(), list2.size());
        });

        return outer;
    }
}
