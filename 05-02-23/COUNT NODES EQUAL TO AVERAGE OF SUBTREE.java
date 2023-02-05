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
public class Pair{
    int number,total;
    Pair(int number,int total){
        this.number=number;
        this.total=total;
    }
}
class Solution {
    int res=0;
    public int averageOfSubtree(TreeNode root) {
        isAverageBT(root);
        return res;
    }
    public Pair isAverageBT(TreeNode root){
        if(root==null) return new Pair(0,0);
        Pair left=isAverageBT(root.left);
        Pair right=isAverageBT(root.right);
        int sum=root.val+left.number+right.number;
        int count=1+left.total+right.total;
        if(sum/count==root.val) res++;
        return new Pair(sum,count);
    }
}
