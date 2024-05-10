//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
            List<List<Integer>> ans = new Solution().CombinationSum2(a, n, k);
            for (List<Integer> list : ans) {
                for (int x : list) ot.print(x + " ");
                ot.println();
            }
            if (ans.size() == 0) ot.println();
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sum = 0;
    
    public List<List<Integer>> CombinationSum2(int arr[], int n, int k) {
        // Code Here.
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(arr);
        sol(arr,n,k,list,l,0);
        return list;
    }
    public void sol(int arr[],int n,int k,  List<List<Integer>> list,List<Integer> l ,int m)
    {
        if(sum == k)
        {
            list.add(l);
            return;
        }
        if(sum > k)
        return;
        
        for(int i = m;i <n;i++)
        {
            if(i > m && arr[i] == arr[i -1]) continue;
            l.add(arr[i]);
            sum += arr[i];
            sol(arr,n,k,list,new ArrayList<>(l),i + 1);
            l.remove(l.size() - 1);
            sum -= arr[i];
            
        }
    }
}
