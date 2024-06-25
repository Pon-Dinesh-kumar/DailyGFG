//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S) {
        // Split the input string by dots (escaped as \\.)
        String[] arr = S.split("\\.");

        int n = arr.length;
        StringBuilder str = new StringBuilder();

        // Append the last word first (if exists)
        str.append(arr[n - 1]);

        // Append other words in reverse order
        if (n > 1) {
            for (int i = n - 2; i >= 0; i--) {
                str.append('.');
                str.append(arr[i]);
            }
        }

        return str.toString();
    }
}