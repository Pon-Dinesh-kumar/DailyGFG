//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Function to return the name of the candidate that received the maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // HashMap to store the count of votes for each candidate
        Map<String, Integer> voteCount = new HashMap<>();

        // Traverse the array and update the vote count
        for (String candidate : arr) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }

        // Variables to keep track of the maximum count and lexicographically smallest candidate
        int maxCount = 0;
        String winner = "";

        // Traverse the HashMap to find the winner
        Set<Map.Entry<String, Integer>> entrySet = voteCount.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String candidate = entry.getKey();
            int count = entry.getValue();

            // Update the winner if the current candidate has more votes or lexicographically smaller in case of a tie
            if (count > maxCount || (count == maxCount && candidate.compareTo(winner) < 0)) {
                maxCount = count;
                winner = candidate;
            }
        }

        // Return the result as an array of strings
        return new String[]{winner, Integer.toString(maxCount)};
    }
}

