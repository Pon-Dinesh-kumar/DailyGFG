//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{
	    int m = 0;
        for(int j = 0; j <= i; j++){
            if(arr[j]>arr[m]){
                m = j;
            }
        }
        return m;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i = n-1; i>0; i--){
	        int m = select(arr,i);
	        int temp = arr[m];
	        arr[m] = arr[i];
	        arr[i] = temp;
	    }
	}
}