//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    
    public static int DFS(Node root, int target, Map<Integer,Integer> hm){
        if(root==null)
            return Integer.MIN_VALUE;
        if(root.data == target)
            hm.put(root.data,0);
        else{
            int t = Math.max(DFS(root.left,target,hm),DFS(root.right,target,hm));
            t = t>Integer.MIN_VALUE ? t+1:Integer.MIN_VALUE;
            hm.put(root.data,t);
        }
        return hm.get(root.data);
    }
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        Map<Integer,Integer> hm = new HashMap<>();
        DFS(root, target,hm);
        
        int minTime = hm.get(root.data);
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        int prevTime = hm.get(root.data);
        Node temp = root.left;
        while(temp!=null || stk.isEmpty()==false){
            while(temp!=null){
                stk.push(temp);
                if(hm.containsKey(temp.data)==false || hm.get(temp.data)==Integer.MIN_VALUE)
                    hm.put(temp.data, ++prevTime);
                prevTime = hm.get(temp.data);
                minTime = Math.max(minTime,prevTime);
                temp=temp.left;
            }
            temp=stk.pop();
            prevTime = hm.get(temp.data);
            temp=temp.right;
        }
        //return hm.get(9);
        return minTime;
    }
}