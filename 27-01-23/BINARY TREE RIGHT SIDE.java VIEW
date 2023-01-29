//2)BINARY TREE RIGHT SIDE VIEW 

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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        Queue<TreeNode>n=new LinkedList<>();
        n.add(root);
        while(!n.isEmpty()){
            int count=n.size();
            for(int i=0;i<count;i++){
                TreeNode cur=n.poll();
                if(i==count-1){
                    l.add(cur.val);
                }
                if(cur.left!=null){
                    n.add(cur.left);
                }
                if(cur.right!=null){
                    n.add(cur.right);
                }
            }
        }
        return l;       
    }
}
