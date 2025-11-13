class Solution {
    public boolean bfs(int i,int[] vis,List<List<Integer>> adj,Queue<Integer> q){
        q.offer(i);
        vis[i]=1;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int neigh:adj.get(node)){
                if(vis[node]==vis[neigh]){
                    return false;
                }
                if(vis[neigh]!=-1){
                    continue;
                }
                q.offer(neigh);
                vis[neigh]=1-vis[node];
                
            }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        Queue<Integer> q=new LinkedList<>();
        int[] vis=new int[n+1];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
            vis[i]=-1;
        }
        
        for(int dis[]:dislikes){
            int u=dis[0];
            int v=dis[1];
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
       for(int i=1;i<=n;i++){
            if(vis[i]==-1&&!bfs(i,vis,adj,q)){
                return false;
            }
       }
       return true;
    }
}