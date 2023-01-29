// 6)FIND MODE IN BINARY SEARCH TREE 

//SOLUTION IN JAVA 

class Solution {
    public void inorder(List<Integer> list, TreeNode root)
    {
        if(root==null)
            return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
    public int[] findMode(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inorder(list,root);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:list)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=0;
        for(int x:map.keySet())
            max=Math.max(max,map.get(x));
        List<Integer> res=new ArrayList<>();
        for(int key:map.keySet())
            if(map.get(key)==max) res.add(key);
        int[] ans=new int[res.size()];
        int index=0;
        for(int i:res)
            ans[index++]=i;
        return ans; 
    }
}
