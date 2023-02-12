// GRAPHS 

// ALL PATHS FROM SOURCE TO TARGET 

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res= new ArrayList();
        List<Integer> temp=new ArrayList();
        temp.add(0);
        dfs(0,temp,graph,graph.length-1,res);
        return res; 
    }
    public void dfs(int s,List<Integer> temp,int graph[][],int d,List<List<Integer>> res){
        if(s==d){
            res.add(new ArrayList(temp));
            return;
        }
        for(int n:graph[s]){
            temp.add(n);
            dfs(n,temp,graph,d,res);
            temp.remove(temp.size()-1);
        }
    }
}
