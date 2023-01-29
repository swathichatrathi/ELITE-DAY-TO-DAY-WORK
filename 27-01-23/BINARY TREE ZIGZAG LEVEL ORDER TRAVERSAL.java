//3)BINARY TREE ZIGZAG LEVEL ORDER TRAVERSAL 

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new LinkedList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>n=new LinkedList<>();
        n.add(root);
        Boolean forw=true;
        while(!n.isEmpty()){
            List<Integer>l=new ArrayList<>();
            int count=n.size();
            for(int i=0;i<count;i++){
                TreeNode cur=n.poll();
                if(forw){
                    l.add(cur.val);
                }
                else{
                    l.add(0,cur.val);
                }
                if(cur.left!=null){
                    n.add(cur.left);
                }
                if(cur.right!=null){
                    n.add(cur.right);
                }   
            }
            ans.add(l);
            forw=!forw;
        }
        return ans;
    }
}
