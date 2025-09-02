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
    // public void inOrder(TreeNode temp, List<Integer> a){
    //     if(temp != null){
    //         inOrder(temp.left, a);
    //         a.add(temp.val);
    //         inOrder(temp.right, a);
    //     }
    // }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        // inOrder(root, arr);
        // return arr;
        // TreeNode curr = root;
        // while(curr != null){
        //     // printing current node
        //     if(curr.left == null){
        //         arr.add(curr.val);
        //         curr = curr.right;
        //     }
        //     else{
        //         // Finding Inorder Predecessor
        //         TreeNode p = curr.left;
        //         while(p.right != null && p.right != curr){
        //             p = p.right;
        //         }
        //         // Creating the Morris Thread
        //         if(p.right == null){
        //             p.right = curr;
        //             curr = curr.left;
        //         }
        //         else{
        //             p.right = null; // Manually Thread is deleted
        //             arr.add(curr.val);
        //             curr = curr.right;
        //         }
        //     }
        // }
        // return arr;
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty())break;
                node = st.pop();
                arr.add(node.val);
                node = node.right;
            }
        }
        return arr;
    }
}