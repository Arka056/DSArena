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
    // public void preOrder(TreeNode root, List<Integer> a)
    // {
    //     if(root != null)
    //     {
    //         a.add(root.val);
    //         preOrder(root.left, a);
    //         preOrder(root.right, a);
    //     }
    // }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        // preOrder(root, a);
        if(root == null) return a;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            a.add(root.val);
            if(root.right != null)st.push(root.right);
            if(root.left != null)st.push(root.left);
        } 
        return a;
    }
}