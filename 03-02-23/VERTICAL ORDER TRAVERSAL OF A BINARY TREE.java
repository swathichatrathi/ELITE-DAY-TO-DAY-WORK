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
    class Pair{
        public TreeNode node;
        public int offset;
        public int level;
        public Pair(TreeNode node, int offset,int level){
            this.node = node;
            this.offset = offset;
            this.level=level;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root == null) return list;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int offset = pair.offset;
            int level=pair.level;
            if(!map.containsKey(offset)){
                map.put(offset,new TreeMap<>());
            }
            if(!map.get(offset).containsKey(level)) map.get(offset).put(level,new PriorityQueue<>());
            map.get(offset).get(level).add(node.val);
            if(node.left!=null){
                q.add(new Pair(node.left,offset-1,level+1));
            }
            if(node.right != null){
                q.add(new Pair(node.right,offset+1,level+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> entry : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> values:entry.values()){
                while(!values.isEmpty()){
                    list.get(list.size()-1).add(values.poll());
                }
            }
        }
        return list;
    }
}
