/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) // when both of the 2 trees are null
            return true;
        if (p == null || q == null) // when 1 of the tree is null
            return false;
        if (q.val != p.val) // when data of 2 nodes are different returns false
            return false;
        else
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // calling left and right subtree of both the trees one at a time
    }
}