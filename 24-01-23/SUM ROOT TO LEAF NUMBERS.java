/*13)SUM ROOT TO LEAF NUMBERS 

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
    public List<Integer> binaryTreePaths(TreeNode root) {
        List<Integer>  list = new ArrayList<>();
        traversal(root,"",list);
        return list;
    }
    public void traversal(TreeNode root,String res,List<Integer> list){
        if(root==null){
            return;
        }
        if(root.right==null && root.left==null){
            list.add(Integer.parseInt(res+root.val));
        }
        traversal(root.left,res+root.val,list);
        traversal(root.right,res+root.val,list);
    }
    public int sumNumbers(TreeNode root) {
        List<Integer> l=binaryTreePaths(root);
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        return sum;
    }
}
