//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
       
        Node first = head;
        Node sec = head.next;
        if(sec.next==null){
            return head;
        }
        
        Node s = sec;
        
        while(sec.next!=null){
            first.next = sec.next;
            first = first.next;
            if(first.next!=null){
                sec.next = first.next;
                sec=sec.next;
            }else{
                sec.next = null;
            }
        }
        
        //reverse sec list
        Node prev = s;
        Node curr = prev.next;
        prev.next = null;
        while(curr!=null){
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        first.next = null;

        
        //make a currect order (Here i apply marge sort on 2 sorted list)
        Node ans = null;
        Node f1 = head,s1 = prev;
        if(f1.data<s1.data){
            ans = f1;
            f1 = f1.next;
        }else{
            ans = s1;
            s1 = s1.next;
        }
        Node temp = ans;
        while(f1!=null && s1!=null){
            if(f1.data<s1.data){
                temp.next = f1;
                temp = temp.next;
                f1 = f1.next;
            }else{
                temp.next = s1;
                temp = temp.next;
                s1 = s1.next;
            }
        }
        
        while(f1!=null){
            temp.next = f1;
            temp = temp.next;
            f1 = f1.next;
        }
        while(s1!=null){
            temp.next = s1;
            temp = temp.next;
            s1 = s1.next;
        }
        
        return ans;
   }

}