// GRAPHS 

// KEYS AND ROOMS 

// SOLUTION IN JAVA 

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited =new boolean[rooms.size()];
        visited[0]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int nei:rooms.get(curr)){
                if(!visited[nei]){
                    visited[nei]=true;
                    q.offer(nei);
                }
            }
        }
        for(boolean res:visited){
            if(res!=true) return false;
        }
        return true;
    }
}
