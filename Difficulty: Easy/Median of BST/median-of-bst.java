class Tree {
    public static List<Integer> inOrder(Node root){
          List<Integer> arr = new ArrayList<>();
          Node curr = root;
        while(curr != null){
            // printing current node
            if(curr.left == null){
                arr.add(curr.data);
                curr = curr.right;
            }
            else{
                // Finding Inorder Predecessor
                Node p = curr.left;
                while(p.right != null && p.right != curr){
                    p = p.right;
                }
                // Creating the Morris Thread
                if(p.right == null){
                    p.right = curr;
                    curr = curr.left;
                }
                else{
                    p.right = null; // Manually Thread is deleted
                    arr.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return arr;
    }
    public static float findMedian(Node root) {
       List<Integer> curr = inOrder(root);
        int n = curr.size();
        if(n % 2 != 0){
            return curr.get(n/2);
        }
        else{
            int mid = n/2;
            float x = (curr.get(mid-1)+curr.get(mid))/2.0f;
            return x;
        }
    }
}