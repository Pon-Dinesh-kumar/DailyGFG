//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 


class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}

class GFG {
    
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
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
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    public static void inorder(Node root){
        if(root == null)
            return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
		while(t-- > 0){
		    String s = br.readLine();
	    	Node root = buildTree(s);
		    Solution obj = new Solution();
		    int res = obj.sumOfLongRootToLeafPath(root);
		    System.out.println(res);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

/*
node class of binary tree
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    // pair to store max height and max sum for each node 
    class Pair {
        int sum;
        int height;
        
        public Pair(){}
        
        public Pair(int sum, int height){
            this.sum = sum;
            this.height = height;
        }
    }
    
    public int sumOfLongRootToLeafPath(Node root)
    {
        Pair p = helper(root);
        return p.sum;
    }
    
    public Pair helper(Node root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return new Pair(root.data, 1);
        
        Pair left = helper(root.left);
        Pair right = helper(root.right);
        Pair curr = new Pair();
        // if left is null, means only right child present, add it's data to curr and return
        if(left == null) return new Pair(root.data + right.sum, right.height + 1);
        // if right is null, means only left child present, add it's data to curr and return
        if(right == null) return new Pair(root.data + left.sum, left.height + 1);
        
        if(left.height > right.height) { // left path length is longer
            curr.sum = left.sum + root.data;
            curr.height = left.height + 1;
        } else if(left.height < right.height) { // right path length is longer
            curr.sum = right.sum + root.data;
            curr.height = right.height + 1;
        } else {    // equal path length case
            curr.sum = Math.max(left.sum, right.sum) + root.data;
            curr.height = right.height + 1;
        }
        
        return curr;
    }
}