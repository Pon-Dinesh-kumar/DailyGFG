//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
          // StringBuilder to store the merged string
        StringBuilder result = new StringBuilder();
        
        // Variables to keep track of the current index for each string
        int i = 0, j = 0;
        
        // Iterate until both strings are completely processed
        while (i < S1.length() && j < S2.length()) {
            // Append characters alternatively from S1 and S2
            result.append(S1.charAt(i++));
            result.append(S2.charAt(j++));
        }
        
        // If there are remaining characters in S1, append them
        while (i < S1.length()) {
            result.append(S1.charAt(i++));
        }
        
        // If there are remaining characters in S2, append them
        while (j < S2.length()) {
            result.append(S2.charAt(j++));
        }
        
        // Convert StringBuilder to String and return the result
        return result.toString();
    }
} 