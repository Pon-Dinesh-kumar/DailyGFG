//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution {
    public int mah(int arr[],int n){
        int res = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stk.isEmpty() && (i == n || arr[i] <= arr[stk.peek()])) {
                int height = arr[stk.pop()];
                int width;
                if (stk.isEmpty()) {
                    width = i;
                } else {
                    width = i - stk.peek() - 1;
                }
                res = Math.max(res, height * width);
            }
            stk.push(i);
        }
        return res;
    }
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int temp[]=new int[m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j]==0){
                    temp[j]=0;
                }
                else{
                  temp[j]=M[i][j]+temp[j];  
                }
                
            }
            max=Math.max(mah(temp,m),max);
        }
        return max;
    }
}

