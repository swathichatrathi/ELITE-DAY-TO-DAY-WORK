// GRAPHS 

// NUMBER OF PROVINCES 

// SOLUTION IN JAVA 

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int vertices=isConnected.length;
        List<List<Integer>> adjlist=new ArrayList<>();
        for(int i=0;i<vertices;i++) adjlist.add(new ArrayList<>());
        for(int i=0;i<vertices;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1) adjlist.get(i).add(j);
            }
        }
        int[] visited=new int[vertices];
        Arrays.fill(visited,-1);
        int components=0;
        for(int i=0;i<vertices;i++){
            if(visited[i]==-1){
                dfs(i,adjlist,visited);
                components++;
            }
        }
        return components;
    }
    public static void dfs(int source,List<List<Integer>> adjlist,int[] visited){
        visited[source]=0;
        for(int nei:adjlist.get(source)){
            if(visited[nei]==-1) dfs(nei,adjlist,visited);
        }
    }
}
