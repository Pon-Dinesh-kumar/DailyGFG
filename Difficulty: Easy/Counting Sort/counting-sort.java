//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        int array[] = new int[123];
        
        for(int i =0; i<arr.length(); i++){
            char ch = arr.charAt(i);
            array[(int) ch]++;
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 97; i<=122; i++){
            while(array[i]>0){
                str.append((char)i);
                array[i]--;
            }
        }
        return str.toString();
    }
}