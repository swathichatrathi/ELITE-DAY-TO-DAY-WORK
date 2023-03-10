//1)INSERT INTO A BINARY SEARCH TREE 

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
class Solution 
{
    public TreeNode insertIntoBST(TreeNode root, int val)
    {
        TreeNode newnode=new TreeNode(val);
        if(root==null)
        {
            root=newnode;
            return root;
        }
        TreeNode parent=null;
        TreeNode current=root;
        while(current!=null)
        {
            parent=current;
            if(val<current.val)
            {
                current=current.left;
            }
            else
            {
                current=current.right;
            }
        }
        if(val<parent.val)
        {
            parent.left=newnode;
        }
        else
        {
            parent.right=newnode;
        }
        return root;
    }
}
