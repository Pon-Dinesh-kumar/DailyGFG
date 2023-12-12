//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public int remAnagrams(String s, String s1) {
        // Frequency arrays to store character counts
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        // Count characters in s
        for (char ch : s.toCharArray()) {
            countS1[ch - 'a']++;
        }

        // Count characters in s1
        for (char ch : s1.toCharArray()) {
            countS2[ch - 'a']++;
        }

        // Calculate the number of characters to be deleted
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(countS1[i] - countS2[i]);
        }

        return deletions;
    }
}
