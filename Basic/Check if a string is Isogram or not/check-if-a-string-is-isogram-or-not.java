//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        }
	 }
}
// } Driver Code Ends





class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
          // Frequency array to store character counts
        boolean[] visited = new boolean[26];
        
        // Traverse each character in the string
        for (char ch : data.toCharArray()) {
            // Convert character to lowercase
            ch = Character.toLowerCase(ch);
            
            // Check if the character has been visited before
            if (visited[ch - 'a']) {
                // If visited, it's not an isogram
                return false;
            }
            
            // Mark the character as visited
            visited[ch - 'a'] = true;
        }
        
        // If all characters are unique, it's an isogram
        return true;
    }
}