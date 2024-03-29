//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0; i<n; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> res = ob.uniquePerms(arr,n);
            for(int i=0; i<res.size(); i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(res.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(arr); // Sort the array to ensure unique permutations
        boolean[] used = new boolean[n];
        ArrayList<Integer> currentPermutation = new ArrayList<>();

        generatePermutations(arr, used, currentPermutation, result);

        return result;
    }

    private static void generatePermutations(ArrayList<Integer> arr, boolean[] used, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (current.size() == arr.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            if (used[i] || (i > 0 && arr.get(i).equals(arr.get(i - 1)) && !used[i - 1])) {
                continue; // Skip duplicates
            }

            used[i] = true;
            current.add(arr.get(i));
            generatePermutations(arr, used, current, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
