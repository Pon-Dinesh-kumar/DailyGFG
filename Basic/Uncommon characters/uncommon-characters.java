//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        StringBuilder str = new StringBuilder();
        
        for(char ch = 'a'; ch<='z'; ch++){
            if(A.contains(String.valueOf(ch)) && B.contains(String.valueOf(ch))){
                
            }
            else if(A.contains(String.valueOf(ch))){
                str.append(ch);
            }
            else if(B.contains(String.valueOf(ch))){
                str.append(ch);
            }
        }
        if(str.length()<1){
            return "-1";
        }
        return str.toString();
    }
}