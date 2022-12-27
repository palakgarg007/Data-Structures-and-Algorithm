// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    ArrayList<Integer> inOrder(Node root) {
        Stack<Node> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        Node temp = root;
        
        while(!s.isEmpty() || temp!=null){
            if(temp!=null){
                s.push(temp);
                temp = temp.left;
            }
            else{
                temp = s.pop();
                list.add(temp.data);
                temp = temp.right;
            }
        }
        return list;
    }
}
