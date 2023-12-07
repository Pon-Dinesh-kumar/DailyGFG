//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int val = (int) s.charAt(i);
            if (val >= 65 && val <= 90) {
                int fromFront = val - 65;
                str.append((char)(90 - fromFront));
            } else if (val >= 97 && val <= 122) {
                int fromFront = val - 97;
                str.append((char)(122 - fromFront));
            }
        }
        return str.toString();
    }
}
