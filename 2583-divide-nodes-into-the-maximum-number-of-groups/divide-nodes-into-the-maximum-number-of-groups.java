class Solution {
    public int magnificentSets(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);
        int ans = 0;

        // find connected components
        boolean[] visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                if (!bipartiteCheck(i, adj, color, visited, component)) {
                    return -1; // not bipartite
                }

                // For each node in this component, get the max BFS level
                int maxLevel = 0;
                for (int node : component) {
                    maxLevel = Math.max(maxLevel, bfsLevel(node, adj, n));
                }
                ans += maxLevel;
            }
        }
        return ans;
    }

    // ✅ Bipartite check with component collection
    private boolean bipartiteCheck(int start, List<List<Integer>> adj, int[] color, boolean[] visited, List<Integer> comp) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;
        visited[start] = true;
        comp.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neigh : adj.get(node)) {
                if (color[neigh] == -1) {
                    color[neigh] = 1 - color[node];
                    q.offer(neigh);
                    visited[neigh] = true;
                    comp.add(neigh);
                } else if (color[neigh] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

    // ✅ BFS to find max levels from one node
    private int bfsLevel(int start, List<List<Integer>> adj, int n) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n + 1];
        q.offer(start);
        vis[start] = true;
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int node = q.poll();
                for (int neigh : adj.get(node)) {
                    if (!vis[neigh]) {
                        vis[neigh] = true;
                        q.offer(neigh);
                    }
                }
            }
            level++;
        }
        return level;
    }
}
