//4)BINARY SEARCH TREE TO GREATER SUM TREE 


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
    public void reverseinorder(TreeNode t){
        if(t==null){
            return ;
        }
        reverseinorder(t.right);
        sum+=t.val;
        t.val=sum;
        reverseinorder(t.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        reverseinorder(root);
        return root;
    }
}
