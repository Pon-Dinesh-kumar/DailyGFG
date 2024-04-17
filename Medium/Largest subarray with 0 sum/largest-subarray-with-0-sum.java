//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        return sol.len(arr,n,0);
        // Your code here
    }
}
class sol{
    static int len(int ar[], int n, int tar){
        int sum = 0, len=0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sum=sum+ar[i];
            // System.out.println("sum:"+sum+" len:"+len+" map:"+mp);
            if(sum==tar) len=i+1;
            else{
                if(mp.containsKey(sum-tar)){
                    len = Math.max(len,(i-mp.get(sum-tar)));
                } else mp.put(sum,i);
            }
        }
        return len;
    }
}