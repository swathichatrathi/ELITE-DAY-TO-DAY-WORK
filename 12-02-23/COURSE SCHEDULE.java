// GRAPHS

// COURSE SCHEDULE 

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        Arrays.fill(indegree,0);
        boolean[] visited=new boolean[numCourses];
        Arrays.fill(visited,false);
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            res.add(curr);
            for(int nei:adj.get(curr)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.add(nei);
                }
            }
        }
        if(res.size()==numCourses)
            return true;
        return false;
    }
}
