//{ Driver Code Starts
import java.util.*;


class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends



class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    boolean flag = true;
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
        if(flag){
            q1.add(a);
        }
        else{
            q2.add(a);
        }
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        int val = -1;
	    if(q1.isEmpty() && q2.isEmpty()){
	        val = -1;
	    }
	    else if(q1.isEmpty()){
	        flag = true;
	        while(true){
	            val = q2.poll();
	            if(q2.isEmpty()){
	                break;
	            }
	            push(val);
	        }
	    }
	    else{
	        flag = false;
	        while(true){
	            val = q1.poll();
	            if(q1.isEmpty()){
	                break;
	            }
	            push(val);
	        }
	    }
	    return val;
    }
	
}

