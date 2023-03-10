//8)RANGE SUM OF BST 

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
    public void sum(TreeNode root,int low,int high){
        if(low<=root.val && root.val<=high){
            sum+=root.val;
        }
        if(root.left!=null){
            sum(root.left,low,high);
        }
        if(root.right!=null){
            sum(root.right,low,high);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum(root,low,high);
        return sum;
    }
}
