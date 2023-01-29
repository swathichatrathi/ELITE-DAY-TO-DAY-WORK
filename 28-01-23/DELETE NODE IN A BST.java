//2)DELETE NODE IN A BST 

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
    public TreeNode deleteNode(TreeNode root, int key)
    {
        if(root==null)
        {
            return root;
        }
        if(key<root.val)
        {
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val)
        {
            root.right=deleteNode(root.right,key);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
            TreeNode par=null;
            TreeNode curr=root;
            while(curr.val!=key)
            {
                par=curr;
                if(key<curr.val)
                {
                    curr=curr.left;
                }
                else
                {
                    curr=curr.right;
                }
            }
            TreeNode temp=curr.right;
            par=curr;
            while(temp.left!=null)
            {
                par=temp;
                temp=temp.left;
            }
            int tempval=temp.val;
            temp.val=curr.val;
            curr.val=tempval;
            curr=temp;
            root.right=deleteNode(root.right,key);
        }
        return root;
    }
}
