/*11)PATH SUM ||

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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        if(root.left == null && root.right == null) {   
            if(root.val == targetSum) {
                List<Integer> path = new LinkedList<>();
                path.add(root.val);
                result.add(path);
            }
        }
        if(root.left != null) {
            List<List<Integer>> leftPath = pathSum(root.left, targetSum-root.val);
            for(List<Integer> path: leftPath) {
                path.add(0, root.val);
                result.add(path);
            }
        }
        if(root.right != null) {
            List<List<Integer>> rightPath = pathSum(root.right, targetSum-root.val);
            for(List<Integer> path: rightPath) {
                path.add(0, root.val);
                result.add(path);
            }
        }
        return result;
    }
}
