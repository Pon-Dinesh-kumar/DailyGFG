//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
     Stack<String> st= new Stack<>();
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        
        String temp= "";
      String outputString="";
       for(int i=0;i<S.length();i++){
          if(S.charAt(i)!='.'){
              temp=temp+S.charAt(i);
          }
          else {
             temp="."+temp;
              st.add(temp);
              temp="";
          }

         if(i==S.length()-1){
             st.add(temp);
         }
      }
      while (st.size()>0){
          outputString=outputString+st.pop();
      }
      return outputString;
    }
}