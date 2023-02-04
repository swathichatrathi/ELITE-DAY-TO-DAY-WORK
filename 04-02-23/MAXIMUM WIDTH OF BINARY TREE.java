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
    public int widthOfBinaryTree(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<TreeNode,Integer> map=new HashMap<>();
        int currentwidth=0;
        int maxwidth=0;
        q.offer(root);
        map.put(root,1);
        while(!q.isEmpty()){
            int size=q.size();
            int start=0;
            int end=0;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(i==0) start=map.get(temp);
                if(i==size-1) end=map.get(temp);
                if(temp.left!=null){
                    map.put(temp.left,map.get(temp)*2);
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    map.put(temp.right,map.get(temp)*2+1);
                    q.offer(temp.right);
                }
            }
            currentwidth=end-start+1;
            if(currentwidth>maxwidth) maxwidth=currentwidth;
        }
        return maxwidth;
    }

}
