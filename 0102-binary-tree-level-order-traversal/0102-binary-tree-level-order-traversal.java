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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> a = new LinkedList<List<Integer>>();
        if(root == null) return a;
        Queue<TreeNode> q = new LinkedList<>(); 
        q.add(root);
        while(! q.isEmpty())
        {
            int n = q.size();
            List<Integer> subList = new ArrayList<Integer>();
            for(int i = 0; i < n; i++)
            {
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                subList.add(q.poll().val);
            }
            a.add(subList);
        }
        return a;
    }
}