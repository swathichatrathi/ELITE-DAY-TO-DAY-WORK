//MINIMUM FUEL COST TO  THE CAPITAL.java 

class Solution {
    long fuel;
    Map<Integer, List<Integer>> adj ;
    int s;
    public long dfs(int node,int parent){
        int representatives=1;
        if(!adj.containsKey(node)) return representatives;
        for(int child:adj.get(node)){
            if (child!=parent) representatives+=dfs(child,node);
        }
        if(node!=0) fuel+=Math.ceil((double) representatives/s);
        return representatives;
    }
    public long minimumFuelCost(int[][] roads, int seats) {
        s=seats;
        adj = new HashMap<>();
        for (int[] road : roads) {
            adj.computeIfAbsent(road[0], k -> new ArrayList<Integer>()).add(road[1]);
            adj.computeIfAbsent(road[1], k -> new ArrayList<Integer>()).add(road[0]);
        }
        dfs(0,-1);
        return fuel;
    }
}
