//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1, String s2) {
        StringBuilder str = new StringBuilder(s1);
        str.append(s2);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (s1.contains(String.valueOf(ch)) && s2.contains(String.valueOf(ch))) {
                str.deleteCharAt(i);
                i--; 
            }
        }
        if (str.length()==0){
            return "-1";
        }
        return str.toString();
    }
}
