//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{

    public static int grayToBinary(int n) {
        if(n==0){
            return 0;
        }
        //convert n to binary
		String nb = "";
		while(n>0) {
			if((n&1)==0) {
				nb="0"+nb;
			}else {
				nb="1"+nb;
			}
			n>>=1;
		}
		//convert to gray code
		String grayCode = "1";
		char gray = '1';
		for(int i=1;i<nb.length();i++) {
			if(nb.charAt(i)==gray) {
				grayCode += "0";
				gray = '0';
			}else {
				grayCode += "1";
				gray = '1';
			}
			 
		}

		//convert grayCode Binary form  to Decimal
		int ans = 0;
		for(int i=0;i<grayCode.length();i++) {
			ans += Math.pow(2, grayCode.length()-i-1) * (grayCode.charAt(i)-'0');
		}
		
		return ans;
    }
       
}



//{ Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}

// } Driver Code Ends