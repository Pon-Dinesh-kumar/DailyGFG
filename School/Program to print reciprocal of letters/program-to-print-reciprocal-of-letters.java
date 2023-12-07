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
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < S.length(); i++) {
            int val = (int) S.charAt(i);
            if (val >= 65 && val <= 90) {
                int fromFront = val - 65;
                str.append((char)(90 - fromFront));
            } else if (val >= 97 && val <= 122) {
                int fromFront = val - 97;
                str.append((char)(122 - fromFront));
            }
            else{
                str.append(" ");
            }
        }
        return str.toString();
    }
}