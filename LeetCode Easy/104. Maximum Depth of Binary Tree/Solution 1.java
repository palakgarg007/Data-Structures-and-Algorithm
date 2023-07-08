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
    public int maxDepth(TreeNode root) {
        if(root == null)   
            return 0;

        int result = depth(root, 0, 0);
        return result;
    }

    public int depth(TreeNode root, int count, int max){
        count++;
        if(root.left == null && root.right == null){
            if(max < count)
                max = count;
            return max;
        }

        if(root.left != null)
            max = depth(root.left, count, max);

        if(root.right != null)
            max = depth(root.right, count, max);
      
        return max;
    }
}
