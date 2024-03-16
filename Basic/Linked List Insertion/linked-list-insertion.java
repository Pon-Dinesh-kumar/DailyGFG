//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
        System.out.println(); 
    }
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            Node head = null;
            for(int i=0; i<n; i++)
            {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if(indicator == 0)
                    head = ob.insertAtBeginning(head, value);
                else
                    head = ob.insertAtEnd(head, value);
            }
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    // Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        Node newNode = new Node(x); // Create a new node with the given data.
        newNode.next = head; // Point the new node's next to the current head.
        return newNode; // Set the new node as the new head.
    }

    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x); // Create a new node with the given data.
        if (head == null) { // If the list is empty, the new node becomes the head.
            return newNode;
        }
        Node current = head;
        while (current.next != null) { // Traverse the list to reach the last node.
            current = current.next;
        }
        current.next = newNode; // Set the next of the last node to the new node.
        return head; // Return the head of the list.
    }
}