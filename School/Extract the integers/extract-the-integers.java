//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        StringBuilder str = new StringBuilder();
        Boolean flag = false;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<s.length();i++){
            int val = (int)s.charAt(i);
            if (val >= 48 && val <= 57) {
                str.append(s.charAt(i));
                flag = true;
            } else if(flag) {
                list.add(str.toString());
                flag = false;
                str.setLength(0);
            }
        }
        if(str.length()>0){
            list.add(str.toString());
        }
        
        if(list.size()==0){
            list.add("No Integers");
        }
        return list;
    }
} 