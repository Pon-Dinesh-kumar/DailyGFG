//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    private void solve(int n, char[] freq, String s, ArrayList<String> ans, StringBuilder temp) {
        // Base case
        if (temp.length() == s.length()) {
            ans.add(temp.toString());
            return;
        }

        // Iterate over all characters
        for (int i = 0; i < n; ++i) {
            if (freq[i] == '0') {
                temp.append(s.charAt(i));
                freq[i] = '1';
                solve(n, freq, s, ans, temp);
                temp.deleteCharAt(temp.length() - 1);
                freq[i] = '0';
            }
        }
    }

    public ArrayList<String> permutation(String S) {
        int n = S.length();
        char[] freq = new char[n];
        for (int i = 0; i < n; ++i) {
            freq[i] = '0';
        }

        StringBuilder temp = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();
        solve(n, freq, S, ans, temp);

        Collections.sort(ans);
        return ans;
    }
	   
}