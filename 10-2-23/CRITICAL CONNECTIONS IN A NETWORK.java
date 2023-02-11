// GRAPHS 

// CRITICAL CONNECTIONS IN A NETWORK

class Solution {
    List<List<Integer>> adjlist=new ArrayList<>();
    int[] low;
    int[] dis;
    boolean[] visited;
    int time=0;
    List<List<Integer>> res;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        res=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int i=0;i<connections.size();i++){
            int u=connections.get(i).get(0);
            int v=connections.get(i).get(1);
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
        low=new int[n];
        dis=new int[n];
        visited=new boolean[n];
        Arrays.fill(visited,false);
        dfs(0,-1);
        return res;
    }
    public void dfs(int s,int p){
        low[s]=dis[s]=time;
        time++;
        visited[s]=true;
        for(int nei:adjlist.get(s)){
            if(nei==p) continue;
            if(!visited[nei]){
                dfs(nei,s);
                low[s]=Math.min(low[s],low[nei]);
                if(low[nei]>dis[s]){
                    List<Integer> l=new ArrayList<>();
                    l.add(s);
                    l.add(nei);
                    res.add(l);
                }
            }
            else{
                low[s]=Math.min(low[s],low[nei]);
            }
        }
    }
}
