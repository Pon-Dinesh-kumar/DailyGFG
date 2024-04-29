//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int size = 1 + (r-l);
        int[] temp = new int[size];
        
        int i =l;
        int j = m+1;
        
        int p=0;
        
        while(i<=m && j <=r){
            if(arr[i]<arr[j]){
                temp[p]=arr[i];
                i++;
            }
            else{
                temp[p]=arr[j];
                j++;
            }
            p++;
        }
        
       
            while(j<=r){
                temp[p]=arr[j];
                p++;
                j++;
            }
        
        
            while(i<=m){
                temp[p]=arr[i];
                p++;
                i++;
            }
            
            for(int k = 0; k<size; k++){
                arr[k+l] = temp[k];
            }
        
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return;
        }
        int m = l + (r-l)/2;
        
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        
        merge(arr, l,m,r);
        
        
    }
}
