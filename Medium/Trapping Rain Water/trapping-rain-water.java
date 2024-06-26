//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        
     int rmax=arr[arr.length-1];
     long ans=0;
     Stack<Integer> st=new Stack<Integer>();
     
     for(int i=arr.length-2; i>=1; i--){
         rmax=Math.max(rmax,arr[i]);
         st.push(rmax);
     }
     
     int leftmax=arr[0];
     
     for(int i=1; i<arr.length-1; i++){
         leftmax=Math.max(leftmax,arr[i]);
         int min=Math.min(st.peek(),leftmax);
         ans+=Math.abs(arr[i]-min);
         st.pop();
     }
     
     return ans;
        
    } 
}

