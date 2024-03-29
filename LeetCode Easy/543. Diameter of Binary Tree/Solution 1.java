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
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }

    public int diameter(TreeNode root){
        if(root == null)
            return 0;
        
        int lh = diameter(root.left);
        int rh = diameter(root.right);

        max = Math.max(lh+rh, max);
        return Math.max(lh,rh) + 1;
    }
}
