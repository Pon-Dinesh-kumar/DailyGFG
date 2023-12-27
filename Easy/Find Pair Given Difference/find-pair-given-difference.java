//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean findPair(int arr[], int size, int n) {
        Arrays.sort(arr); // Sort the array in ascending order

        int left = 0;
        int right = 1;

        while (right < size && left < size) {
            int diff = arr[right] - arr[left];

            if (diff == n && left != right) {
                return true; // Found a pair with the required difference
            } else if (diff > n) {
                left++;
            } else {
                right++;
            }
        }

        return false; // No pair with the required difference found
    }
}