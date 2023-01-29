// 3)CONVERT BST TO GREATER TREE 

//SOLUTION IN JAVA 

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
    int sum=0;
    public void reverseinorder(TreeNode root){
        if(root==null) return;
        reverseinorder(root.right);
        sum+=root.val;
        root.val=sum;
        reverseinorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        reverseinorder(root);
        return root;
    }
}
