//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        int[] arr = new int[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                arr[i]=1;
            }
            else{
                arr[i]=-1;
            }
        }
        int ans=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==1){
                int temp =1;
                int c=1;
                for(int j=i+1; j<arr.length;j++){
                    temp+=arr[j];
                    if(temp<0){
                        break;
                    }
                    c++;
                    if(temp==0){
                        ans = Math.max(ans,c);
                    }
                }
            }
        }
        return ans;
    }
}