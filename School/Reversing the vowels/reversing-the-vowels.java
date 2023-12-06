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
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        StringBuilder str = new StringBuilder(s);
        
        int start =0;
        int end = s.length()-1;
        
        while(start<=end){
            while( start<end && str.charAt(start)!='a' && str.charAt(start)!='e' && str.charAt(start)!='i' && str.charAt(start)!='o' && str.charAt(start)!='u'){
                start++;
            }
            while( end>start && str.charAt(end)!='a' && str.charAt(end)!='e' && str.charAt(end)!='i' && str.charAt(end)!='o' && str.charAt(end)!='u'){
                end--;
            }
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end,temp);
            
            start++;
            end--;
        }
        return str.toString();
    }
}