//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
public static void bubbleSort(int arr[], int n) {
        // Initial call to the recursive bubble sort function
        recursiveBubbleSort(arr, n);
    }
    
    // A recursive function to perform bubble sort
    static void recursiveBubbleSort(int arr[], int n) {
        // Base case: If n is 1, then return as the array is sorted
        if (n == 1) {
            return;
        }

        // One pass of bubble sort. After this pass, the largest element is moved (or bubbled) to end.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swapping elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Largest element is fixed, recur for remaining array
        recursiveBubbleSort(arr, n - 1);
    }
    
}

//{ Driver Code Starts.

class Sorting
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}

}
// } Driver Code Ends