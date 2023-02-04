/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        if(root==null){
            return res.toString();
        }
        Queue<TreeNode>n=new LinkedList<>();
        n.add(root);
        while(!n.isEmpty()){
            int count=n.size();
            for(int i=0;i<count;i++){
                TreeNode cur=n.poll();
                if(cur==null) res.append("null").append(",");
                else{
                    res.append(cur.val).append(",");
                    if(cur.left!=null){
                        n.add(cur.left);
                    }
                    if(cur.left==null){
                        n.add(null);
                    }
                    if(cur.right!=null){
                        n.add(cur.right);
                    }  
                    if(cur.right==null){
                        n.add(null);
                    } 
                }
            }
        }
        return res.toString();
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data){
        if (data.isEmpty()) return null;
        String ans[] =data.split(",");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(ans[0]));
        q.offer(root);
        for(int i=1;i<ans.length;i=i+2){
            TreeNode temp=q.poll();
            if(!ans[i].equals("null")){
                temp.left=new TreeNode(Integer.parseInt(ans[i]));
                q.offer(temp.left);
            }
            if(!ans[i+1].equals("null")){
                temp.right=new TreeNode(Integer.parseInt(ans[i+1]));
                q.offer(temp.right);
            }
        }
        return root;
    }
}
