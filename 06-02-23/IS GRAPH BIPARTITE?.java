// GRAPHS 


// IS GRAPH BIPARTITE?

// SOLUTION IN JAVA 

class Solution {
    public boolean isBipartite(int[][] graph) {
        int vertices=graph.length;
        List<List<Integer>> adjlist=new ArrayList<>();
        for(int i=0;i<vertices;i++) adjlist.add(new ArrayList<>());
        for(int i=0;i<vertices;i++){
            for(int j=0;j<graph[i].length;j++){
                adjlist.get(i).add(graph[i][j]);
            }
        }
        int[] visited=new int[vertices];
        Arrays.fill(visited,-1);
        for(int i=0;i<vertices;i++){
            if(visited[i]==-1){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                visited[i]=0;
                while(!q.isEmpty()){
                    int curr=q.poll();
                    for(int nei:adjlist.get(curr)){
                        if(visited[nei]==-1){
                            visited[nei]=1+visited[curr];
                            q.add(nei);
                        }
                        else if(visited[curr]==visited[nei]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
