// PATH TO GIVEN NODE 

//SOLUTION IN JAVA 

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    private boolean findPath(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return false;
        }
        path.add(root.val);
        if (root.val == target) {
            return true;
        }
        if (findPath(root.left, target, path) || findPath(root.right, target, path)) {
            return true;
        }   
        path.remove(path.size() - 1);
        return false;
    }
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> path = new ArrayList<>();
        if (findPath(A,B,path)) {
            return path;
        }
        return new ArrayList<>();
    }
