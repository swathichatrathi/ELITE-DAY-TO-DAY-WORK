/* 3)BINARY TREE MAXIMUM PATH SUM 

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
    int maxsum=Integer.MIN_VALUE;
    public int pathsum(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(0,pathsum(root.left));
        int r=Math.max(0,pathsum(root.right));
        int currsum=l+r+root.val;
        if(currsum>maxsum){
            maxsum=currsum;
        }
        return Math.max(l,r)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root.left==null && root.right==null){
            return root.val;
        }
        pathsum(root);
        return maxsum;
    }
}
