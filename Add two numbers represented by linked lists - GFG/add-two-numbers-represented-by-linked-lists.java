//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node head){
        if(head==null || head.next==null)
            return head;
        
        Node newNode = reverse(head.next);
        
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    
    static Node addTwoLists(Node first, Node second){
        
        first = reverse(first);
        second = reverse(second);
        
        int carry = 0, sum=0;
        Node result = new Node(-1);
        Node curr = result;
        
        while(first!=null || second!=null){
            if(first==null){
                sum = second.data + carry;
                second = second.next;
            }
            else if(second==null){
                sum = first.data + carry;
                first = first.next;
            }
            else{
                sum = first.data + second.data + carry;
                first = first.next;
                second = second.next;
            }
            
            carry = 0;
            
            if(sum>9){
                sum = sum-10;
                carry = 1;
            }
            Node n = new Node(sum);
            curr.next = n;
            curr = n;
        }
        
        if(carry == 1){
            Node n = new Node(1);
            curr.next = n;
            curr = n;
        }
        
        curr.next = null;
        return reverse(result.next);
    }
}