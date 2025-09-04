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
    public int height(TreeNode root, int [] diameter){
    if(root == null) return 0;
    else{
        int [] leftHeight = new int[1];
        int [] rightHeight = new int[1];
        leftHeight[0] = height(root.left, diameter);
        rightHeight[0] = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], (leftHeight[0] + rightHeight[0]));
        return 1 + Math.max(leftHeight[0], rightHeight[0]);
    }
}
    public int diameterOfBinaryTree(TreeNode root) 
    {
        int [] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }
}