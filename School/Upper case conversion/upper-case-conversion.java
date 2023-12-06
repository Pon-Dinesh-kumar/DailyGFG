//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public String transform(String s) {
        // Use the correct parameter name 's' instead of 'S'
        StringBuilder str = new StringBuilder(s);

        boolean flag = true;

        // Start the loop from 1 to s.length() - 1
        for (int i = 0; i < s.length(); i++) {
            if (flag) {
                // Use the correct method 'setCharAt' to change a character at a specific index
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                flag = false;
            }
            if (str.charAt(i) == ' ') {
                flag = true;
            }
        }

        // Use the correct method 'toString' to convert StringBuilder to String
        return str.toString();
    }
}
