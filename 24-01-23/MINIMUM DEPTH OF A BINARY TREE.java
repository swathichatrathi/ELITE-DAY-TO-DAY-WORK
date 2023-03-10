/*7)MINIMUM DEPTH OF A BINARY TREE 

SOLUTION IN JAVA */


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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return height(root.right)+1;
        }
        if(root.right==null){
            return height(root.left)+1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.min(left,right)+1;
    }
    public int minDepth(TreeNode root) {
        TreeNode temp=root;
        return height(temp);
    }
}
