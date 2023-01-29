/*1)BALANCE A BINARY SEARCH TREE*/

/*SOLUTION IN JAVA*/

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
    List<Integer> inorder=new ArrayList<>();
    public void inordertraversal(TreeNode root){
        if(root==null){
            return;
        }
        inordertraversal(root.left);
        inorder.add(root.val);
        inordertraversal(root.right);
    }
    public TreeNode balance(TreeNode root,int low,int high){
        if(low>high){
            return null;
        }
        int mid=(low+high)/2;
        TreeNode root1=new TreeNode(inorder.get(mid));
        root1.left=balance(root1.left,low,mid-1);
        root1.right=balance(root1.right,mid+1,high);
        return root1;
    }
    public TreeNode balanceBST(TreeNode root) {
        inordertraversal(root);
        return balance(root,0,inorder.size()-1);
    }
}
