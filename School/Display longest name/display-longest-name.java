//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;

  public class longestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t;

        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            String[] names = new String[n];

            for (int j = 0; j < n; j++) names[j] = sc.next();

            GFG obj = new GFG();
            System.out.println(obj.longest(names, n));
        }
    }

}

// } Driver Code Ends


class GFG {
    String longest(String names[], int n) {
        int max =0;
        String ans ="";
        for(int i=0;i<n;i++){
            int len = names[i].length();
            if(len>max){
                ans = names[i];
                max = len;
            }
        }
        return ans;
    }
}