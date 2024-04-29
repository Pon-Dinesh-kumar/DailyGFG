//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
   static void quickSort(int arr[], int low, int high) {
    if (low >= high) {
        return;  // Corrects the base case condition to handle segments of length 1 or less.
    }

    int pivot = arr[high];  // Using the last element as the pivot
    int i = low - 1;        // Index of the smaller element

    for (int j = low; j < high; j++) {
        // If the current element is smaller than or equal to pivot
        if (arr[j] <= pivot) {
            i++;

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Swap the pivot element with the element at i+1 position
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    // Recursively sort elements before partition and after partition
    quickSort(arr, low, i);
    quickSort(arr, i + 2, high);  // Note the change here to i+2 to skip over the pivot
}


 
}
