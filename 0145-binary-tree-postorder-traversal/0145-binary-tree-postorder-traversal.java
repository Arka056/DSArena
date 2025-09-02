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
    // public void postOrder(TreeNode root, List<Integer> a)
    // {
    //     if(root != null)
    //     {
    //         postOrder(root.left, a);
    //         postOrder(root.right, a);
    //         a.add(root.val);
    //     }
    // }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        if(root == null)return a;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        st1.push(root);
        while(! st1.isEmpty()){
            TreeNode node = st1.pop();
            s2.push(node);
            if(node.left != null)st1.push(node.left);
            if(node.right != null)st1.push(node.right);
        }
        while(! s2.isEmpty()){
            a.add(s2.pop().val);
        }
        return a;
    }
}