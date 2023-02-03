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
    ArrayList<Integer> list=new ArrayList<>();
    public void preorder(TreeNode root){
        if(root==null) return;
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public void flatten(TreeNode root){
        if(root==null) return;
        preorder(root);
        TreeNode temp=root;
        temp.left=null;
        temp.right=null;
        for(int i=1;i<list.size();i++){
            temp.right=new TreeNode(list.get(i));
            temp=temp.right;
        }
    }
}
