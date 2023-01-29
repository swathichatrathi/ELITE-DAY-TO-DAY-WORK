//5)CONSTRUCT BINARY SEARCH TREE FROM PREORDER TRAVERSAL 


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
class Solution{
    public TreeNode insert(TreeNode root,int data){
        TreeNode newnode=new TreeNode(data);
        if(root==null){
            root=newnode;
            return root;
        }
        TreeNode curr=root;
        TreeNode par=null;
        while(curr!=null){
            par=curr;
            if(data<curr.val){
                curr=curr.left;
            }
            else{
                curr=curr.right;
            }
        }
        if(data<par.val){
            par.left=newnode;
        }
        else{
            par.right=newnode;
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        int k=1;
        while(k<preorder.length){
            root=insert(root,preorder[k]);
            k++;
        }   
        return root;   
    }
}
