//{ Driver Code Starts
import java.util.*;
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class GfG {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}





// } Driver Code Ends


/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue {
    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int a) {
        QueueNode newNode = new QueueNode(a);
        if (rear == null) {
            // When the queue is empty, both front and rear point to the new node.
            front = newNode;
            rear = newNode;
        } else {
            // Append new node at the end of the queue and update rear.
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Function to pop front element from the queue.
    int pop() {
        if (front == null) {
            // Return -1 if the queue is empty.
            return -1;
        } else {
            // Retrieve data to return, move front to the next node.
            int data = front.data;
            front = front.next;
            // If the queue becomes empty, make sure to reset rear as well.
            if (front == null) {
                rear = null;
            }
            return data;
        }
    }
}




