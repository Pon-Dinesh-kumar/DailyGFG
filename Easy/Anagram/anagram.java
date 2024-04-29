//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution {
    
    // Function to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        // If the lengths of the strings are different, they can't be anagrams.
        if (a.length() != b.length()) {
            return false;
        } 
        
        
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : b.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        
        
        for (char c : a.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
        }
        
        
        return true;
    }
}