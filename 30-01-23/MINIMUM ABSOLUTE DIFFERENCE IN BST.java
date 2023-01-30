// 2)MINIMUM ABSOLUTE DIFFERENCE IN BST 

// SOLUTION IN JAVA 

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
    public void inordertraversal(TreeNode root,List<Integer> inorder){
        if(root==null) return;
        inordertraversal(root.left,inorder);
        inorder.add(root.val);
        inordertraversal(root.right,inorder);
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        inordertraversal(root,inorder);
        for(int i=0;i<inorder.size()-1;i++){
            mini=Math.min(mini,inorder.get(i+1)-inorder.get(i));
        }
        return mini;
    }
}
