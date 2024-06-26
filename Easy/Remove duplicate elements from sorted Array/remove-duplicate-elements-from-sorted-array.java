//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for(int i=0; i<N; i++)
                a[i] = sc.nextInt();
            
            Solution g = new Solution();
            int n = g.remove_duplicate(a,N);
            
            for(int i=0; i<n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
            T--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int remove_duplicate(int arr[],int N){
        int i=0;
        int j=1;
       while(i<N-1){
           if(arr[i]!=arr[i+1]){
               arr[j] = arr[i+1];
               j++;
               i++;
           }
           else{
               int k=i+1;
               while(k<N && arr[i]==arr[k]){
                   k++;
               }
               if(k>=N) break;
               else arr[j]=arr[k];
               j++;
               i=k;
           }
       }
       return j;
    }
}