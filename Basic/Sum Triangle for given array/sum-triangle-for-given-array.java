//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long Triangle[] = obj.getTriangle(a, n);
            int sz = Triangle.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(Triangle[i]+" ");
            System.out.println(output);
            
        }
	}
}



// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public long[] getTriangle(long arr[], long n)
    {
        long len = (n*(n+1)) / 2;
        long[] ans = new long[(int)len];  // Cast len to int
        
        for(long i = 0; i < n; i++){
            ans[(int)(len - n + i)] = arr[(int)i];  // Cast indices to int
        }
        len = len - n - 1;
        for(long i = n - 1; i > 0; i--){
            long c = 1;
            while(c <= i){
                ans[(int)len] = ans[(int)(len+i+1)] + ans[(int)(len+i)];  // Cast index to int
                len--;  // Decrement len inside the loop
                c++;
            }
        }
        return ans;
    }
}
