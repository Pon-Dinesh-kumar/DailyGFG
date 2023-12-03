//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.swapNibbles(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int swapNibbles(int N) {
        int[] arr = new int[8];
        int c = 0;

        while (N != 0) {
            arr[c] = N&1;
            N >>= 1;
            c++;
        }
        swap(arr, 0, 3);
        swap(arr, 1, 2);
        swap(arr, 4, 7);
        swap(arr, 5, 6);
        int ans = 0;
        for(int i=0;i<8;i++){
            ans|=(arr[i]&1);
            
            if (i < 7) {
                ans <<= 1; // Shift left before the next iteration (except for the last iteration)
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

