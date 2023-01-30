// CONSTRUCT BINARY TREE FROM PREORDER AND INORDER TRAVERSAL 

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
class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int currindex;
    public TreeNode constructtree(int[] preorder,int s,int e){
        if(s>e){
            return null;
        }
        int rootvalue=preorder[currindex++];
        TreeNode node=new TreeNode(rootvalue);
        int inplace=map.get(rootvalue);
        node.left=constructtree(preorder,s,inplace-1);
        node.right=constructtree(preorder,inplace+1,e);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        currindex=0;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return constructtree(preorder,0,preorder.length-1);
    }
}
