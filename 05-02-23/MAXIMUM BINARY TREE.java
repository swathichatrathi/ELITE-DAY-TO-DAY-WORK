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
class Solution{
    public TreeNode constructMaximumBinaryTree(int[] nums){
        return build(nums,0,nums.length);
    }
    public TreeNode build(int[] nums,int low,int high){
        if(low==high) return null;
        int maxindex=low;
        for(int i=low;i<high;i++){
            if(nums[maxindex]<nums[i]) maxindex=i;
        }
        TreeNode root=new TreeNode(nums[maxindex]);
        root.left=build(nums,low,maxindex);
        root.right=build(nums,maxindex+1,high);
        return root;
    }
}
