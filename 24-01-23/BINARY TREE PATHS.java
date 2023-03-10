/*6)BINARY TREE PATHS 

SOLUTION IN JAVA*/

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>  list = new ArrayList<>();
        traversal(root,"",list);
        return list;
    }
    public void traversal(TreeNode root,String res,List<String> list){
        if(root==null){
            return;
        }
        if(root.right==null && root.left==null){
            list.add(res+root.val);
        }
        traversal(root.left,res+root.val+"->",list);
        traversal(root.right,res+root.val+"->",list);
    }
}
