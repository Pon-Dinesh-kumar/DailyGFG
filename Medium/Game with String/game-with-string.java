//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{

//this method returns char with the highest value
     static char hv( HashMap<Character,Integer> h)
     {
         int m=-1;
         char cch='z';
      for(Character i:h.keySet())
      {
          m=Math.max(m,h.get(i));
          if(m==h.get(i))
          {
              cch=i;
          }
      } 
      return cch;
     }
    
    static int minValue(String s, int k){
       HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        { char ch=s.charAt(i);
            if(map.containsKey(ch))
            {
               map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        int ans=0;
        while(k>0)
        {
           map.put(hv(map),map.get(hv(map))-1) ;
           k--;
        }
        for(Character i:map.keySet())
        {
               ans+=map.get(i)*map.get(i);  
        }
        return ans;
    }
}