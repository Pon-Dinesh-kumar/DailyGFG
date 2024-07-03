//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            GFG llist = new GFG();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public Node removeAllDuplicates(Node head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        Node node1 = head;
        Node node2 = head;
        Node ans = new Node(1);
        Node ans1 = ans;
        
        while(node1!=null){
            if(map.containsKey(node1.data)){
                int temp = map.get(node1.data);
                map.put(node1.data, temp+1);
            }
            else{
                map.put(node1.data,1);
            }
            node1 = node1.next;
        }
        
        while(node2!=null){
            int temp = map.get(node2.data);
            if(temp==1){
                ans1.next = node2;
                ans1 = ans1.next;
            }
            node2 = node2.next;
        }
                        ans1.next = null;
        if(ans.next==null){
            ans = null;
            return ans;
        }
         Node curr = ans;
         ans = ans.next;
         curr.next = null;
         return ans;
    }
}