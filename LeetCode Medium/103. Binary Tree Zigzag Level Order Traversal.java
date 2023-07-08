/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;

        if(root == null)
            return res;

        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i=0; i<n; i++){
                sublist.add(queue.peek().val);
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!= null)
                    queue.offer(queue.peek().right);
                queue.poll();
            }
            level++;
            if(level%2 != 0)
                res.add(sublist);
            else{
                Collections.reverse(sublist);
                res.add(sublist);
            }
        }
        return res;
    }
}
