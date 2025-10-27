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
    private void path(TreeNode root, String p, List<String> ans){
        if(root == null) return;
        p += root.val;
        if(root.left == null && root.right == null){
            ans.add(p);
            return;
        }
        p += "->";
        path(root.left, p, ans); 
        path(root.right, p, ans); 
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null) return ans;
        path(root, "", ans);
        return ans;
    }
}