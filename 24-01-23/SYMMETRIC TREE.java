/*8)SYMMETRIC TREE 

//SOLUTION IN JAVA */

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
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public boolean check(TreeNode left,TreeNode right){
        if(right==null && left==null){
            return true;
        }
        if(left==null && right!=null){
            return false;
        }
        if(right==null && left!=null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        boolean check1=check(left.left,right.right);
        if(check1==false){
            return false;
        }
        boolean check2=check(left.right,right.left);
        if(check2==false){
            return false;
        }
        return check1 && check2;
    }
}
