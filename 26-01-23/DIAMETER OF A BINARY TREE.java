/* 2)DIAMETER OF A BINARY TREE 

METHOD 1: SOLUTION IN JAVA */

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
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh+rh>dia){
            dia=lh+rh;
        }
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return dia;
    }
}

//METHOD 2:SOLUTION IN JAVA 

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
    int dia;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        if(l+r>dia){
            dia=l+r;
        }
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }
}
