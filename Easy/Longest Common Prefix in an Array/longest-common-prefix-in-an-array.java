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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int minLen = Integer.MAX_VALUE;
        String res = "";
         
        for(int i = 0; i < n; i++) 
            minLen = Math.min(minLen, arr[i].length()); 
        
        /*eg how below two for loops work are :String[] arr = {"flower", "flow", "flight"};
for(int i = 0; i < 4; i++) {
Iteration 1: i = 0 ,Iteration 2: i = 1 ,Iteration 3: i = 2 ,Iteration 4: i = 3

for(int j = 0; j < 3; j++) {
Iteration 1: j = 0 (String: "flower") , Iteration 2: j = 1 (String: "flow") ,Iteration 3: j = 2 (String: "flight") */
        for(int i = 0; i < minLen; i++) //(Loop over each character position up to minLen - 1):
        {
            
            char it = arr[0].charAt(i); //.charAt(i) is used to access the character at index i within the string arr[0].
            int flag = 0;
            
            for(int j = 0; j < n; j++) //(Loop over each string in the array):
            {
                char ch = arr[j].charAt(i);
                if(ch != it)
                    flag = 1;
            }
            
            if(flag == 1) {
                if(res.length() == 0)
                    return "-1";
                else 
                    return res;
            }
            else
                res += it;
        }
        
        return res;
    }
    
}

