//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(n, nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        char arr[]={'!','#','$','%','&','*','?','@','^'};
        String str1="";
        String str2="";

        //Storing all the elements in a String
        for(int i=0;i<n;i++){
            str1+=nuts[i];
            str2+=bolts[i];
        }
        int j=0;
        for(char i : arr){

            // checking if char i is present in  the string , is yes put it 

            // in the coressponding place.
            if(str1.indexOf(i)!=-1){
                nuts[j]=i;
            }
            if(str2.indexOf(i)!=-1){
                bolts[j]=i;
                j++;
            }
        }
    }
}

