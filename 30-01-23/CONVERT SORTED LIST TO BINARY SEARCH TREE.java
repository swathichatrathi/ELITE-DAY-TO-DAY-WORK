// 3)CONVERT SORTED LIST TO BINARY SEARCH TREE 

// SOLUTION IN JAVA 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return new TreeNode(head.val);
        }
        List<Integer> nums = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            nums.add(temp.val);
            temp=temp.next;
        } 
        return tree(nums,0,nums.size()-1);
    }
    public TreeNode tree(List<Integer> nums,int i,int j)
    {
        if(i>j){
            return null;
        }
        int mid=(i+j)/2;
        TreeNode main=new TreeNode(nums.get(mid));
        main.left=tree(nums,i,mid-1);
        main.right=tree(nums,mid+1,j);
        return main;
    }
}
