//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    long countWays(int n)
    {
        if(n<4){
            return n;
        }
        long prev = 3;
        long prevprev = 2;

        for(int i = 4 ; i<=n; i++){
            long temp = (prev + prevprev)%1000000007;
            prevprev = prev;
            prev = temp;
        }
        return prev;
    }
}

