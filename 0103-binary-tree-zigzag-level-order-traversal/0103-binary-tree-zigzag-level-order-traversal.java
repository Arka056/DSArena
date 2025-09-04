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
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        // Queue is needed for Level order traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Flag to check from left -> right or right -> left
        boolean flag = true; // true: left -> right, false: right -> left
        while(! q.isEmpty()){
            int n = q.size();
            int []rows = new int[n];
            for(int i = 0; i < n; i++){
                TreeNode node = q.poll();
                int idx = flag ? i : (n-i-1);
                rows[idx] = node.val;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            flag =  !flag;
            List<Integer> list = new ArrayList<>();
            for (int val : rows) list.add(val);
            ans.add(list);
        }
        return ans;
    }
}