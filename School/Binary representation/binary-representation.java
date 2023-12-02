//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String getBinaryRep(int N) {
        String str = "";
        int count = 30;

        while (N != 0) {
            str = (char) ((N & 1) + '0') + str;
            N = N >> 1;
            count--;
        }

        for (int i = count; i > 0; i--) {
            str = '0' + str;
        }

        return str;
    }
}
