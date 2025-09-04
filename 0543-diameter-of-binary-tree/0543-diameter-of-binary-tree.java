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
    private int max = 0;
    public int height(TreeNode root){
    if(root == null) return 0;
    int lHeight = height(root.left);
    int rHeight = height(root.right);
    max = Math.max(max, (lHeight + rHeight));
    return 1 + Math.max(lHeight, rHeight);
}
    public int diameterOfBinaryTree(TreeNode root) 
    {
        // int [] diameter = new int[1];
        if(root == null)return 0;
        height(root);
        return max;
    }
}