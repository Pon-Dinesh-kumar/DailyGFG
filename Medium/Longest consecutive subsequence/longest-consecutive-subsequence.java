//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int nums[], int N)
    {
       // add your code here
        Arrays.sort(nums);
        int[] a=new int[nums.length];
        int k=0;
        Map<Integer,Integer> ans=new HashMap<>();
        if(nums.length==0) return 0;
        ans.put(nums[0],1);
        for(int i=1;i<nums.length;i++){
            if(!ans.containsKey(nums[i]) && nums[i]!=(1+nums[i-1]) ){
                ans.put(nums[i],1);
            }
            else if(ans.containsKey(nums[i])){
                continue;
            }
            else if(!ans.containsKey(nums[i]) && nums[i]==(1+nums[i-1])){
                ans.put(nums[i],ans.get(nums[i-1])+1);
            }
            
        }
       int max=0;
             for(int x:ans.keySet()){
                 if(ans.get(x)>max){
                     max=ans.get(x);
                 }
             }
         return max;
    }
}

