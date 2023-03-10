/*2)LOWEST COMMON ANCESTOR OF A BINARY SEARCH TREE 

//SOLUTION IN JAVA */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        if(root.val>p.val && root.val>q.val){
            TreeNode l=lowestCommonAncestor(root.left,p,q);
            return l;
        }
        if(root.val<p.val && root.val<q.val){
            TreeNode r=lowestCommonAncestor(root.right,p,q);
            return r;
        }
        return root;
    }
}
