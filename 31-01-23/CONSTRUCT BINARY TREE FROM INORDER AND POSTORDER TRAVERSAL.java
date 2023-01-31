// CONSTRUCT BINARY TREE FROM INORDER AND POSTORDER TRAVERSAL 

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
    public TreeNode constructtree(int[] postorder,int[] inorder,int s,int e){
        if(s>e){
            return null;
        }
        int rootvalue=postorder[currindex--];
        TreeNode node=new TreeNode(rootvalue);
        int inplace=map.get(rootvalue);
        node.right=constructtree(postorder,inorder,inplace+1,e);
        node.left=constructtree(postorder,inorder,s,inplace-1);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        currindex=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return constructtree(postorder,inorder,0,inorder.length-1);
    }
}
