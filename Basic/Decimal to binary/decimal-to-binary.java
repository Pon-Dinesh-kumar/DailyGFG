//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int N) {
		int ans =0;
		boolean flag = true;
		int c=0;
		while(N>0){
		    int rem = N%2;
		    ans|=rem;
		    N/=2;
		    ans<<=1;
		    if(rem==1){
		        flag=false;
		    }
		    if(flag){
		        c++;
		    }
		}
		ans>>=1;
		while(ans>0){
		    System.out.print((ans&1));
		    ans>>=1;
		}
		while(c>0){
		    System.out.print("0");
		    c--;
		}
	}
}