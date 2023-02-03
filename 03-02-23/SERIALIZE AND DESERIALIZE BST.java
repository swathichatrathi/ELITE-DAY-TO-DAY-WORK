// SERIALIZE AND DESERIALIZE BST 

//SOLUTION IN JAVA


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec { 
    // Encodes a tree to a single string.
   public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        preorder(root,res);
        return res.toString();
    }
    
    public void preorder(TreeNode root, StringBuilder res) {
        if (root == null) return;
        res.append(root.val).append(",");
        preorder(root.left,res);
        preorder(root.right,res);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(q, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }  
    public TreeNode helper(Queue<String> q, int lower, int upper) {
        if (q.isEmpty()) return null;
        String s = q.peek();
        int val = Integer.parseInt(s);
        if (val < lower || val > upper) return null;
        q.poll();
        TreeNode root = new TreeNode(val);
        root.left = helper(q, lower, val);
        root.right = helper(q, val, upper);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
